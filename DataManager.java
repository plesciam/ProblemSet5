package ProblemSet5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataManager {

public static Connection getMySQLConnection(String user, String password)
{
    try
    {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/WilliamsMagicShop", user, password);
    } 
    catch (SQLException exception)
    {
        System.out.println("Failed to connect to the database" + exception.getMessage());
        return null;
    }
}

}