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
            List<String> names = sakila.actorsSearcher();
            System.out.println(names);
        }
        catch (IllegalStateException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

       try( Connection conn = dataSource.getConnection()) {
           FilmDao filmDao = new FilmDao(conn);
       // List<String>birdTitles  = filmDao.findByTitleBird();
       //    System.out.println(birdTitles);
           int count = filmDao.countRentalRate();
           System.out.println(count);


       }catch (SQLException se) {
           throw new IllegalStateException("Cannot connet !", se);
       }
    }
}
