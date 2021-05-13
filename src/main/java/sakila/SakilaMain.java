package sakila;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class SakilaMain {


    public static void main(String[] args) {


       MysqlDataSource dataSource = new MysqlDataSource();
        try {
            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
            Sakila sakila = new Sakila(dataSource);
           // List<String> names = sakila.actorsSearcher();
           // System.out.println(names);
        }
        catch (IllegalStateException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

       try( Connection conn = dataSource.getConnection()) {
           FilmDao filmDao = new FilmDao(conn);
       // List<String>birdTitles  = filmDao.findByTitleBird();
       //    System.out.println(birdTitles);
           int count = filmDao.countRentalRate(0.99);
           System.out.println(count);
       //    count = filmDao.countRentalDuration(5);
        //   System.out.println(count);
           int min = filmDao.findShortestTimeByRental(1);
           System.out.println(min);
           double max = filmDao.findHighestRatio();
           System.out.println(max);
           count = filmDao.countFilmFromSpecialFeatures("Trailers");
           System.out.println(count);
           count = filmDao.countFilmByRating("NC-17");
           System.out.println(count);
           Film newFilm = new Film("Nincs kettő négy nélkül", "Brazil", 1983, 1, 1, 21, 4.99, 100, 25.0, "NC-17", "");
           filmDao.insert(newFilm);
       }catch (SQLException se) {
           throw new IllegalStateException("DB error!", se);
       }
    }
}
