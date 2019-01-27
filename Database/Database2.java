package Database;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDataSourceObjectFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database2 {

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setPassword("Nzpbe123.");
        ds.setUser("obuszko");
        ds.setDatabaseName("obuszko");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);

        String sql = "SELECT * FROM Forum.Topics";

        try (
                Connection con = ds.getConnection();
                Statement stmt = con.createStatement();
            ){
            ResultSet rs = stmt.executeQuery(sql);

            String topicBody;
            int id;
            while (rs.next()){
                id = rs.getInt(1);
                topicBody = rs.getString(4);

                if (topicBody != null){
                    System.out.println("Klient: " + id + " Temat: " + topicBody);
                }
            }

        }catch (SQLException e) {
            System.out.println("Problem z bazą danych" + e.getMessage());
        }

    }


}











