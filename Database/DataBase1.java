package Database;

import com.microsoft.sqlserver.jdbc.*;

import java.sql.*;

public class DataBase1 {

    public static void main(String[] args) {

        String connectionURL = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=obuszko;password=Nzpbe123.";
        try {
            Connection con = DriverManager.getConnection(connectionURL);

            Statement stmt = con.createStatement();
            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()){
                System.out.println(rs.getString(4) + " "  + rs.getString(6) + " " + rs.getString(15));
                if (rs.getString(4).equals("Pilar")){
                    System.out.println("Znaleziono użytkopwnika z imieniem Pilar");
                }
            }

            rs.close();
            stmt.close();
            con.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
