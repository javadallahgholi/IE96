package Common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mashayekhi on 2/10/2017 AD.
 */
public class Reservation implements Serializable {
    private List<Passenger> passengers;
    private Flight flight;
    private String tocken , refrence_code;
    private List<Integer> ticket_numbers;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getTocken() {
        return tocken;
    }

    public void setTocken(String tocken) {
        this.tocken = tocken;
    }

    public String getRefrence_code() {
        return refrence_code;
    }

    public void setRefrence_code(String refrence_code) {
        this.refrence_code = refrence_code;
    }

    public List<Integer> getTicket_numbers() {
        return ticket_numbers;
    }

    public void setTicket_numbers(List<Integer> ticket_numbers) {
        this.ticket_numbers = ticket_numbers;
    }

    public String RES_query() {
        return "RES " + flight.getOrigin_code() + " " + flight.getDestination_code() + " " + flight.getDate()
                + " " + flight.getAirline_code() + " " + flight.getFlight_no() + " " + flight.getSeat_class()
                + " " + flight.getAdult() + " " + flight.getChild() + " " + flight.getInfant() + ".%n " +
                passengers.toString();
    }
}
