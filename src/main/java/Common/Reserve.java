package Common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 * Created by j-ghazvne on 2/12/17.
 */
public class Reserve implements ControllerNode {
    private String originCode;
    private String destinationCode;
    private String date;
    private String airlineCode;
    private int flightNo;
    private String seatType;
    private int adlultCount , childCount , infantCount;
    private List<Passenger> passengers = new ArrayList<Passenger>();
    private String token;


    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getAdlultCount() {
        return adlultCount;
    }

    public void setAdlultCount(int adlultCount) {
        this.adlultCount = adlultCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getInfantCount() {
        return infantCount;
    }

    public void setInfantCount(int infantCount) {
        this.infantCount = infantCount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String RES_query() {
        String result = "";
        String s = "";
        String temp = "RES " + originCode + " " + destinationCode + " " + date
                + " " + airlineCode + " " + flightNo + " " + seatType
                + " " + adlultCount + " " + childCount + " " + infantCount + "\n";
        for(int i = 0; i < passengers.size(); i++)
            s += passengers.get(i).getFirst() + " " + passengers.get(i).getLast() + " "
                    + Integer.toString(passengers.get(i).getId()) + "\n";
        result = temp + s.substring(0, s.length()-1);
        //System.out.println(result);
        return result;
    }

    public String getFinalizationOfReservation(Reserve reserve){
        return "";
    }

    public String getId() {
        return token;
    }
}
