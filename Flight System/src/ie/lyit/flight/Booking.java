/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Repeat Assignemt
 * Date: 11/06/2019
 * @author John T Ugwu
 * @version 1.0
**/
package ie.lyit.flight;
import java.util.ArrayList;
import ie.lyit.flight.Flight;

public class Booking
{

    private Flight outbound;
    private Flight inbound ;
    private ArrayList<Passenger> passengers;
    private double totalPrice;
    private static int count =0;



//default constructor
public Booking()
{
    this.outbound=null;
    this.inbound=null;
    this.passengers = new ArrayList<Passenger>();
    this.totalPrice = 0.0;
    count++;
}

public Booking(Flight oF,Flight iF, ArrayList<Passenger> p)
{
        this.outbound=oF;
        this.inbound=iF;
        this.passengers=p;
        count++;
}

@Override
public String toString()
{

    return "Outbound" +outbound + "Inbound:" + inbound + "TotalPrice" + totalPrice + "Number of bookings:" + count;
}


public boolean equals(Object obj)
{
        Booking bObject;
        if (obj instanceof Booking)
            bObject = (Booking) obj;
        else
            return false;
        return this.inbound == bObject.inbound &&
                this.outbound == bObject.outbound &&
                this.totalPrice == bObject.totalPrice;

}

    // findPassenger() method
    public boolean findPassenger(Passenger p)
    {

        return this.passengers.contains(p);
    }

    public double calculatePrice()
    {

        return (this.inbound.getPrice()+this.outbound.getPrice()) * passengers.size();
    }

    // set() and get() method

    public void setTotalPrice()
    {

        this.totalPrice = calculatePrice();
    }

    public double getTotalPrice() 
    {

        return totalPrice;
    }


    public double getCalculatePrice()
    {

        return totalPrice;
    }
}


