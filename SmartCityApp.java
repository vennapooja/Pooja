package mini_project;

import java.util.*;

public class SmartCityApp 
{
	List<Hotel> hotels = new ArrayList<>();
    List<Transportation> transportationOptions = new ArrayList<>();
    List<Shopping> shoppingmalls = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    SmartCityApp()
    {
    	 hotels.add(new Hotel("Tourist Hotel", "kachiguda", 1500.0));
    	 hotels.add(new Hotel("Falaknama palace", "Falaknama", 12000.0));
    	 hotels.add(new Hotel("Western Suites ", "HiTechCity", 2000.0));
    	 
    	 transportationOptions.add(new Transportation("Taxi", "Convenient way to get around the city."));
         transportationOptions.add(new Transportation("Public Transit", "Affordable and reliable public transportation system."));
         transportationOptions.add(new Transportation("Metro", "Avoid Traffic and convenient to Travel."));
         transportationOptions.add(new Transportation("MMTS", "Convenient And Affordable."));
    	 
         shoppingmalls.add(new Shopping("GVK One Mall","Banjara Hills"));
         shoppingmalls.add(new Shopping("City Central Mall","Banjara Hills"));
         shoppingmalls.add(new Shopping("Inorbit Mall","Madhapur"));
    }

    
    
    public void Hotel()
    {
    	System.out.println("==================================================================================================");
        for (Hotel hotel : hotels) 
        {
            System.out.println(hotel.getName() + " - " + hotel.getAddress() + " - $" + hotel.getPricePerNight() + " per night");
        }
    }  
    
    public void Transportation()
    {
    	System.out.println("==================================================================================================");
    	for (Transportation transportation : transportationOptions)
    	{
            System.out.println(transportation.getType() + " - " + transportation.getDescription());
        }
    }
    
    public void Shopping() 
    {
    	System.out.println("==================================================================================================");
    	for (Shopping Shoppingmall : shoppingmalls) 
        {
            System.out.println(Shoppingmall.getShopname() + " - " + Shoppingmall.getShopAddress());
        }
    }
    
    
}
