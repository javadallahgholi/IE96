package Common;

import java.util.List;

/**
 * Created by Mashayekhi on 2/10/2017 AD.
 */
public class ReqResBean {
    private String origin_code , destination_code , date , airline_code;
    private String departure_time , arrival_time , airplane_model;
    private String seat_class ;
    private int flight_no , adult_price , child_price , infant_price;
    private List<Passenger> passengers;
    private List<Integer> ticket_numbers;
    private String tocken;
    private int refrence_code;

    public String getOrigin_code() {
        return origin_code;
    }

    public String getDestination_code() {
        return destination_code;
    }

    public String getDate() {
        return date;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public String getAirplane_model() {
        return airplane_model;
    }

    public String getSeat_class() {
        return seat_class;
    }

    public int getFlight_no() {
        return flight_no;
    }

    public int getAdult_price() {
        return adult_price;
    }

    public int getChild_price() {
        return child_price;
    }

    public int getInfant_price() {
        return infant_price;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Integer> getTicket_numbers() {
        return ticket_numbers;
    }

    public String getTocken() {
        return tocken;
    }

    public int getRefrence_code() {
        return refrence_code;
    }

    public void setOrigin_code(String origin_code) {
        this.origin_code = origin_code;
    }

    public void setDestination_code(String destination_code) {
        this.destination_code = destination_code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAirline_code(String airline_code) {
        this.airline_code = airline_code;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public void setAirplane_model(String airplane_model) {
        this.airplane_model = airplane_model;
    }

    public void setSeat_class(String seat_class) {
        this.seat_class = seat_class;
    }

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }

    public void setAdult_price(int adult_price) {
        this.adult_price = adult_price;
    }

    public void setChild_price(int child_price) {
        this.child_price = child_price;
    }

    public void setInfant_price(int infant_price) {
        this.infant_price = infant_price;
    }

    public void setTicket_numbers(List<Integer> ticket_numbers) {
        this.ticket_numbers = ticket_numbers;
    }

    public void setTocken(String tocken) {
        this.tocken = tocken;
    }

    public void setRefrence_code(int refrence_code) {
        this.refrence_code = refrence_code;
    }
}
