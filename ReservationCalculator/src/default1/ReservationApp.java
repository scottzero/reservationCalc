/*
•Author: wolfeJob
•Date:11/5/2017 
•Description: The application prompts the user for the month, day, and year of the arrival and the departure. 
Then, the application displays the arrival date, the departure date, the room rate, the total price, and the number of nights.
*/
package default1;
import java.util.*;//Using Scanner, Date and Gregorian Calendar


public class ReservationApp extends Reservation {//our public class is a subclass of Reservation. 

     public static void main(String[] args) {//Start main method.
       System.out.println("Welcome to the Reservation Calculator.");//Greeting to user.
       System.out.println();//Creates a new line. 
       Scanner sc = new Scanner(System.in);//Declares a new scanner object named sc.
       Reservation reserve = new Reservation();//Creates a new object of the Reservation class named 'reserve'.
       String choice = "y";//This assigns 'y' as the String variable choice value. 
        while(choice.equalsIgnoreCase("y")) //Condition for our while loop, if the user enters 'y' as their choice. 
        {//Begin while loop.
             
            System.out.print("Enter the arrival month (1-12): "); //Promtps user to enter the month they will arrive. 
            int arriveMM = sc.nextInt(); //Uses scanner to take integer input.
            System.out.print("Enter the arrival day (1-31): ");//Promtps user to enter the day of arrival.
            int arriveDD = sc.nextInt();//Uses scanner to take integer input. 
            System.out.print("Enter the arrival year:  ");//Prompts user to enter the year they will arrive. 
            int arriveYY =sc.nextInt();//Uses scanner to take integer input. 
            System.out.println("");//Enter a space between next set of prompts.    
            GregorianCalendar arriveDate = new GregorianCalendar (arriveYY,arriveMM,arriveDD) ; //Could not get Epoch time to work for some reason
            arriveDate.getTime();
            Date arrival = arriveDate.getTime();
        
            System.out.print("Enter the departure month (1-12):  ");//Prompts the user to enter the month they departure. 
            int departMM = sc.nextInt();//Uses scanner to take integer input.
            System.out.print("Enter the departure day (1-31):  ");//Prompts the user to enter the day they departure.
            int departDD = sc.nextInt();//Uses scanner to take integer input.
            System.out.print("Enter the departure year:   ");//Prompts the user to enter the year they departure.
            int departYY = sc.nextInt();//Uses scanner to take integer input.
            
            // GregorianCalendar object
            GregorianCalendar dDate = new GregorianCalendar (departYY,departMM,departDD);
            // convert GregorianCalendar to date object
            Date departure = dDate.getTime();
            // pass arrival and departure date object to reserveation class
            reserve.Reservation(arrival,departure);//Here we pass the arrival date and departure date as parameters through our reservation object.                    
            System.out.println("");//Prints a new blank line the console. 
            
            /* The code below will print arrival date, departure date, room rate, total price, and the number of nights.
            For this calculation to work correctly, the arrival date must actually occur before the departure date; nor can they be 
            on the same day, or total price will return 0.00.
            */
            System.out.println("Arrival Date: " + reserve.getFormattedArrivalDate()); //This outputs the arrival date, which we get from our string method from Reservation Class. 
            System.out.println("Departure Date: "+reserve.getFormattedDepartureDate());
            System.out.println("Price: " +nightlyRate+" per night");
            System.out.println("Total price: " + reserve.getTotalPrice()+" for " +reserve.getNumberofNights()+ " nights ");
            System.out.print("\n"+"Continue? (y/n): ");//Asks user if they want to continue
            choice=sc.next();//Choice 'y' or 'n' if user wants to continue.
            
           
        }//End while loop.
        
        
    }

  
}

