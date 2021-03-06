package sakila;

import java.sql.*;
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
    private PreparedStatement highestRatio;
    private PreparedStatement shortestTimeByRental;
    private PreparedStatement specialFeatures;
    private PreparedStatement filmByRating;
    private PreparedStatement allFilm;

    public FilmDao(Connection connection)throws SQLException {
        this.connection = connection;
        this.filmTitleBird = connection.prepareStatement("SELECT title FROM film WHERE title LIKE '%BIRD%'");
        this.longestFilmLength = connection.prepareStatement("SELECT MAX(LENGTH) FROM film");
        this.insert = connection.prepareStatement("insert into film (" +
                "title, description, release_year,original_language_id, language_id" +
                ", rental_duration, rental_rate, length, replacement_cost, rating, special_features)" +
                " values (?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        this.update = connection.prepareStatement("update film set title = ?, language_id = ? WHERE film_id = ? ");
        this.delete = connection.prepareStatement("delete from film where id = ?");
        this.rentalRateCounter = connection.prepareStatement(" SELECT COUNT(rental_rate) FROM film  WHERE rental_rate = ?");
        this.rentalDuration = connection.prepareStatement("SELECT COUNT(*) FROM film WHERE rental_duration < ?");
        this.highestRatio = connection.prepareStatement("SELECT MAX(replacement_cost/rental_rate) FROM film");
        this.shortestTimeByRental = connection.prepareStatement("SELECT MIN(length) FROM film WHERE rental_rate <= ?");
        this.specialFeatures = connection.prepareStatement("SELECT COUNT(*) FROM film WHERE special_features LIKE ? ");
        this.filmByRating = connection.prepareStatement("SELECT COUNT(*) FROM film WHERE rating = ?");
        this.allFilm = connection.prepareStatement("Select * from film");
    }


    public List<Film> findAll() throws SQLException {
        List<Film> films = new ArrayList<>();
        ResultSet rs = this.allFilm.executeQuery();
        while (rs.next()) {
            Film film = new Film(rs.getInt("id"),rs.getString("title"),
                    rs.getString("description"), rs.getInt("release_year"),
                    rs.getInt("language_id"),
                    rs.getInt("original_language_id"),rs.getInt("rental_duration"),
                    rs.getDouble("rental_rate"),
                    rs.getInt("length"), rs.getDouble("replacement_cost"),
                    rs.getString("rating"),rs.getString("special_features"));
            films.add(film);
        }
        return films;
    }

    public List<String> findByTitleBird () throws SQLException {
        List<String> names = new ArrayList<>();
        ResultSet rs = this.filmTitleBird.executeQuery();
        while (rs.next()) {
            String name = rs.getString("title");
            names.add(name);
            return names;
        }
        throw new IllegalArgumentException("No result !");
    }

    public int getLongestFilmLength() throws SQLException {
        int length = 0;
        ResultSet rs = this.longestFilmLength.executeQuery();
        if(rs.next()) {
            length =rs.getInt("max(length)");
            return length;
        }
        throw new IllegalArgumentException("No result !");
    }

    public int countRentalRate(double rate) throws SQLException {
        int count = 0;
        this.rentalRateCounter.setDouble(1, rate);
        ResultSet rs = this.rentalRateCounter.executeQuery();
        while(rs.next()) {
            count=rs.getInt("count(rental_rate)");
        }
        return count;
    }

    public int countRentalDuration(int duration)throws SQLException {
        int count = 0;
        this.rentalDuration.setInt(1, duration);
        ResultSet rs = this.rentalDuration.executeQuery();
        while(rs.next()) {
            count=rs.getInt("count(*)");
        }
        return count;
    }

    public double findHighestRatio()throws SQLException {
        double max = 0;
        ResultSet rs = this.highestRatio.executeQuery();
        if (rs.next()) {
            max = rs.getDouble("MAX(replacement_cost/rental_rate)");
        }
        return max;
    }

    public int findShortestTimeByRental(double rate)throws SQLException {
        int min = 0;
        this.shortestTimeByRental.setDouble(1, rate );
        ResultSet rs = this.shortestTimeByRental.executeQuery();
        if(rs.next()) {
            min = rs.getInt("min(length)");
        }
        return min;
    }

    public int countFilmFromSpecialFeatures(String specialFeatures) throws SQLException {
        int count = 0;
        this.specialFeatures.setString(1,"%"+specialFeatures+"%");
        ResultSet rs = this.specialFeatures.executeQuery();
        if(rs.next()) {
            count = rs.getInt("count(*)");
        }
        return count;
    }

    public int countFilmByRating(String rating)throws SQLException {
        int count = 0;
        this.filmByRating.setString(1,rating);
        ResultSet rs = this.filmByRating.executeQuery();
        if(rs.next()) {
            count = rs.getInt("count(*)");
        }
        return count;

    }

    public Film insert(Film newFilm) throws SQLException {
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
        ResultSet keys = this.insert.getGeneratedKeys();
        if (keys.next()) {
            newFilm.setId(keys.getInt(1));
        }
        return newFilm;
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
