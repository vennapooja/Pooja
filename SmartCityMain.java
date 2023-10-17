package mini_project;

import java.util.*;

public class SmartCityMain {

	public static void main(String[] args) 
	{
			System.out.println("====================================================================");
			System.out.println("============= Smart City App=============================");
			System.out.println("====================================================================");
			String ch;
	        Scanner scanner = new Scanner(System.in);
	        SmartCityApp app=new SmartCityApp();
		

        do
        {
            System.out.println("Welcome to the Smart City App!");
            System.out.println("1. Find Hotels");
            System.out.println("2. Explore Transportation");
            System.out.println("3. Find ShoppingMalls");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Hotels in the city:");
                    app.Hotel();
                    break;
                case 2:
                    System.out.println("Transportation options in the city:");
                    app.Transportation();
                    break;
                case 3:
                    System.out.println("ShoppingMall options in the city:");
                    app.Shopping();
                    break;

                case 4:
                    System.out.println("Thank you for using the Smart City App. Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println("Do you want to continue? (Y-Yes / N-No)");
			ch=scanner.next();
            }  
			
			while(ch.equals("Y")||ch.equals("y"));
			System.out.println("====================================================================");

			System.out.println("Enjoy Your Travelling....");
		
			System.out.println("====================================================================");

	}
}
