package ProblemSet5;

import java.util.Scanner;

public class PresenationLayer 
{
    public static void main(String[] args)
    {
    Scanner userInformation = new Scanner(System.in);
    System.out.println("Enter username and password:");
    String userName = userInformation.nextLine();
    String password = userInformation.nextLine();

    DAL dal = new DAL(userName, password);
    PresenationLayer PL = new PresenationLayer();

    if(dal.TryExecutingAQuery(userName, password))
    {
        System.out.println("Successfully connected to the database");
        call.dal();
    }
    else
    {
        System.out.println("Failed to connect to the database");
    }
    if (dal.TryExecutingAStoredProcedure("WilliamsMagi9cShop", userName, password))
    {
        System.out.println("Successfully ran a stored procedure");
        call.dal();
    }
     else
    {
        System.out.println("Failed to run a stored procedure");
    }

}
}