

/*
•Author: wolfeJob
•Date:11/5/2017 
•Description:  The application prompts the user for the month, day, and year of the arrival and the departure. 
Then, the application displays the arrival date, the departure date, the room rate, the total price, and the number of nights.
*/
package default1;
import java.text.*; //Imports all java text related libraries. I will specifically be using [Date Format].
import java.util.*;//This will import the calender library used and the date functions.
public class Reservation { //The start of our Reservation Class. 
    
    private  Date arrivalDate; //Instance variable arrivalDate. 
    private  Date departureDate; //Instance variable departureDate. 
    private  long elapsedDays;
    private  long TotalPrice; 
    public static final long nightlyRate = (long) 95.00; //Declaring the nightly rate of $95.00
    
    
     public void Reservation(Date arrivalDate, Date departureDate)
    {
        this.departureDate = departureDate;   
        this.arrivalDate = arrivalDate;              
    }
    Reservation() {
    }
 
    public  long  calculateNumberofNights()
    {
      long  arrivalDateTime =  arrivalDate.getTime();
      long departureDateTime = departureDate.getTime();
      long elapse = departureDateTime-arrivalDateTime;
      elapsedDays = elapse/(24*60*60*1000);//24 Minutes, 60 Minutes, 60 seconds, 1000 milliseconds
      return elapsedDays;
    }
    
    public long getNumberofNights()
    {
        this.calculateNumberofNights();
        return elapsedDays;
    }
    public long   calculateTotalPrice()
    { 
      long  arrivalDateTime =  arrivalDate.getTime();
      long departureDateTime = departureDate.getTime();
      long elapse = departureDateTime-arrivalDateTime;
      elapsedDays = elapse/(24*60*60*1000);
      TotalPrice =  elapsedDays *nightlyRate;
      return TotalPrice;
    }
    
    public  long getTotalPrice()
    {
       this.calculateTotalPrice();
        return TotalPrice;
    }
    public String getFormattedArrivalDate()//Here we get our formatted ArrivalDate
    { 
            DateFormat adateFormat = DateFormat.getDateInstance(DateFormat.FULL);
            String formattedArrivalDate =adateFormat.format(arrivalDate);
            return formattedArrivalDate;
    }
    public String getFormattedDepartureDate() //Here we get our formatted departure date
    {
  
            DateFormat adateFormat = DateFormat.getDateInstance(DateFormat.FULL);
            String formattedArrivalDate =adateFormat.format(departureDate);
            return formattedArrivalDate;
    }



}