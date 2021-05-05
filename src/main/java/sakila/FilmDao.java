package sakila;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDao {
    private Connection connection;
    private PreparedStatement filmTitleBird;
    private PreparedStatement longestFilmLength;
    private PreparedStatement insert;
    private PreparedStatement update;
    private PreparedStatement delete;
    private PreparedStatement rentalRateCounter;
    private PreparedStatement rentalDuration;

    public FilmDao(Connection connection)throws SQLException {
        this.connection = connection;
        this.filmTitleBird = connection.prepareStatement("SELECT title FROM film WHERE title LIKE '%BIRD%'");
        this.longestFilmLength = connection.prepareStatement("SELECT MAX(LENGTH) FROM film");
        this.insert = connection.prepareStatement("insert into film (" +
                "title, description, release_year,original_language_id, language_id" +
                ", rental_duration, rental_rate, length, replacement_cost, rating, special_features)" +
                " values ('?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?')");
        this.update = connection.prepareStatement("update film set title = ?, language_id = ? WHERE film_id = ? ");
        this.delete = connection.prepareStatement("delete from film where id = ?");
        this.rentalRateCounter = connection.prepareStatement(" SELECT COUNT(rental_rate) FROM film  WHERE rental_rate = ?");
        this.rentalDuration = connection.prepareStatement("SELECT COUNT(*) FROM film WHERE rental_duration < ?");
    }


    public List<Film> findAll() throws SQLException {
        return null;

    }

    public List<String> findByTitleBird () throws SQLException {
        List<String> names = new ArrayList<>();
        ResultSet rs = this.filmTitleBird.executeQuery();
        while (rs.next()) {
            String name = rs.getString("title");
            names.add(name);
        }
        return names;
    }

    public int getLongestFilmLength() throws SQLException {
        int length = 0;
        ResultSet rs = this.longestFilmLength.executeQuery();
        if(rs.next()) {
            length =rs.getInt("max(length)");
        }
        return length;
    }

    public int countRentalRate() throws SQLException {
        int count = 0;
        ResultSet rs = this.rentalRateCounter.executeQuery();
        while(rs.next()) {
            count=rs.getInt("count(rental_rate)");
        }
        return count;
    }

    public int countRentalDuration()throws SQLException {
        int count = 0;
        ResultSet rs = this.rentalDuration.executeQuery();
        while(rs.next()) {
            count=rs.getInt("count(*)");
        }
        return count;
    }

    public void insert(Film newFilm) throws SQLException {
        this.insert.setString(1, newFilm.getTitle());
        this.insert.setString(2, newFilm.getDescription());
        this.insert.setInt(3, newFilm.getReleaseYear());
        this.insert.setInt(4, newFilm.getLanguageId());
        this.insert.setInt(5,newFilm.getOriginalLanguageId());
        this.insert.setInt(6, newFilm.getRentalDuration());
        this.insert.setDouble(7, newFilm.getRentalRate());
        this.insert.setInt(8, newFilm.getLength());
        this.insert.setDouble(9, newFilm.getReplacementCost());
        this.insert.setString(10, newFilm.getRating());
        this.insert.setString(11, newFilm.getSpecialFeatures());
        this.insert.executeUpdate();
    }

    public void update(Film film) throws SQLException {
        this.update.setString(1, film.getTitle());
        this.update.setInt(2, film.getLanguageId());
        this.update.executeUpdate();

    }

    public void delete(int id) throws SQLException {
        this.delete.setInt(1, id );
        this.delete.executeUpdate();

    }
}
