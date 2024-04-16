package ProblemSet5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class DAL {
    
   private Connection connection;

   
    public DAL(String user, String password) 
    {
      this.connection =  DataManager.getMySQLConnection(user, password);
    }

     String query = "select * from Inventory";
    
    public boolean TryExecutingAStoredProcedure(String user, String password) 
    {   
        try
        {
        Statement myStatement = connection.createStatement();
        ResultSet myRelation = ((java.sql.Statement) myStatement).executeQuery(query);

        while(myRelation.next())
        {
            String MagicTyppes = myRelation.getString("Inventory");
            int myMagicTypesID = myRelation.getInt("ItemID");
            System.out.println("Tuple Values: " + myMagicTypesID + "," + myMagicTypesID);

            String DangerLevel = myRelation.getString("Inventory");
            int myDangerLevelID = myRelation.getInt("ItemID");
            System.out.println("Tuple Values: " + myDangerLevelID + "," + myDangerLevelID);

            String ItemName = myRelation.getString("Inventory");
            int myItemID = myRelation.getInt("ItemID");
            System.out.println("Tuple Values: " + myItemID + "," + myItemID);

            String ItemDescription = myRelation.getString("Inventory");
            int myDescriptionID = myRelation.getInt("ItemID");
            System.out.println("Tuple Values: " + myDescriptionID + "," + myDescriptionID);

            String ID = myRelation.getString("Inventory");
            int myID = myRelation.getInt("ItemID");
            System.out.println("Tuple Values: " + myID + "," + myID);
            }
            } catch (SQLException myException)
            {
            System.out.println("Failed to execute stored procedure: " + myException.getMessage());
            }
        
        {
            CallableStatement myStoredProcedureCall = connection.prepareCall("{Call getInventory()}");
            ResultSet myResultSet = myStoredProcedureCall.executeQuery();

            CallableStatement StoredProcedureCall = connection.prepareCall("{Call getInventory()}");
            ResultSet ResultSet = myStoredProcedureCall.executeQuery();
        
            CallableStatement myStoreProcedureCall = connection.prepareCall("{Call getInventory()}");
            ResultSet ResultSets = myStoredProcedureCall.executeQuery();
        }
        return false;

    }   
}