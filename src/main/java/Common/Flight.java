package Common;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mashayekhi on 2/10/2017 AD.
 */
public class Flight implements Serializable, ControllerNode {
    private String origin_code , destination_code , date;
    private String arrival_time , departure_time , airline_code;
    private int adult , child , infant;
    private int flight_no;
    private String seat_class;
    private ArrayList<Seat> seat_class_list ;
    private String airplane_model;
    private Map<Seat, Integer> price_number= new HashMap<Seat, Integer>();

    private String seats;
    private String flightInfo;

//    public String getFlightInfo(){
//        System.out.println("\t\t\t" + flightInfo);
//        return flightInfo;
//    }

    public String weDoNotKnowWhatIsThisMethodName(){
        String[] splited = flightInfo.split(" ");
        return String.format("Flight: %s %s Departure: %s Arrival: %s Airplane: %s", splited[0], splited[1], turnToTime(splited[5])
                , turnToTime(splited[6]), splited[7]);
    }

    public String turnToTime(String string ){
        return string.substring(0,2) + ":" + string.substring(2);
    }

    public Flight(String flightInfo , String seats) {
        this.flightInfo = flightInfo;
        this.seats = seats;

//        System.out.println("flightInfo is: " + flightInfo + " " + seats);
        String[] splited = flightInfo.split("\\s+");

        airline_code = splited[0];
        flight_no = Integer.parseInt(splited[1]);
        date = splited[2];
        origin_code = splited[3];
        destination_code = splited[4];
        departure_time = splited[5];
        arrival_time = splited[6];
        airplane_model = splited[7];

        seat_class_list = new ArrayList<Seat>();
    }

    public void feedSeat() throws IOException {
        String[] splited = seats.split("\\s+");
        for (String current : splited){
            Seat temp = new Seat(flight_no,current.charAt(0),current.charAt(1));
            seat_class_list.add(temp);
        }
    }


    public String getOrigin_code() {
        return origin_code;
    }

    public void setOrigin_code(String origin_code) {
        this.origin_code = origin_code;
    }

    public String getDestination_code() {
        return destination_code;
    }

    public void setDestination_code(String destination_code) {
        this.destination_code = destination_code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public void setAirline_code(String airline_code) {
        this.airline_code = airline_code;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public int getInfant() {
        return infant;
    }

    public void setInfant(int infant) {
        this.infant = infant;
    }

    public int getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }

    public String getSeat_class() {
        return seat_class;
    }

    public void setSeat_class(String seat_class) {
        this.seat_class = seat_class;
    }

    public String getAirplane_model() {
        return airplane_model;
    }

    public void setAirplane_model(String airplane_model) {
        this.airplane_model = airplane_model;
    }

    public List<Seat> getSeat_class_list() {
        return seat_class_list;
    }

    public void setSeat_class_list(ArrayList<Seat> seat_class_list) {
        this.seat_class_list = seat_class_list;
    }

    public String PRICE_query() {return "PRICE " + origin_code + " " + destination_code + " "
                                + airline_code + " " + seat_class; }


    public String getPriceForThisPassengers(int adult_no, int child_no , int infant_no){
        String result = null ; // Todo produce first line.
        for (Seat current : seat_class_list){
            result += "\n" + current.calculatedPrice(adult_no,child_no,infant_no);
        }
        return result;
    }

    public String getId() {
        return String.valueOf(flight_no);
    }
}
