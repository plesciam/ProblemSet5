package ProblemSet5;

import java.util.Scanner;

public class PresentationLayer 
{
    public static void main(String[] args)
    {
    Scanner userInformation = new Scanner(System.in);
    System.out.println("Enter username and password:");
    String userName = userInformation.nextLine();
    String password = userInformation.nextLine();

    DAL dal = new DAL(userName, password);
    PresentationLayer PL = new PresentationLayer();

    {
        System.out.println("Failed to connect to the database");
    }
}
}
