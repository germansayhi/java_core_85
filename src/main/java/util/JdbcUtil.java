package util;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        String url ="jdbc:mysql://localhost:3306/final_exam";
        String user ="root";
        String password ="root";
       return DriverManager.getConnection(url,user,password);
    }
    public static void checkConnection(){
        try(Connection connection = getConnection()){
            System.out.println("Ket noi thanh cong "+ connection.getCatalog());
        }catch (SQLException e){
            System.err.println("Ket noi that bai "+ e.getMessage());
        }
    }
}
