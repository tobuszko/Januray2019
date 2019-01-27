package Database;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBase3 {

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setPassword("Nzpbe123.");
        ds.setUser("obuszko");
        ds.setDatabaseName("AdventureWorks");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);

        String sql;

        try (
                Connection con = ds.getConnection();
                Statement stmt = con.createStatement();
        ){
            sql =  "SELECT TOP 10 * FROM Person.Contact WHERE LastName = 'Anderson'";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Users with last name ANDERSON:");
            while (rs.next()){
                System.out.println(rs.getString(4 ) + " " + rs.getString(6));
            }

            System.out.println("");
            System.out.println("Nazwy stanowisk:");
            sql ="SELECT DISTINCT(Title) FROM HumanResources.Employee" ;
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getString(1));
            }

            System.out.println("");
            System.out.println("Klienci z największą liczbą zamwówień:");
            sql = "select TOP 10 CustomerID, count(*) AS NumberOfOrders from Sales.SalesOrderHeader SH group by CustomerID order by  NumberOfOrders desc";
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println("Klient o nr: " + rs.getString(1) + " Ilość zamówień: " + rs.getString(2)) ;
            }

        }catch (SQLException e) {
            System.out.println("Problem z bazą danych" + e.getMessage());
        }

    }






}
