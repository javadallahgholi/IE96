package Common;

import java.util.List;

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
    private List<Passenger> passengers;
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
        return "RES " + originCode + " " + destinationCode + " " + date
                + " " + airlineCode + " " + flightNo + " " + seatType
                + " " + adlultCount + " " + childCount + " " + infantCount + ".%n " +
                passengers.toString();
    }

    public String getFinalizationOfReservation(Reserve reserve){
        return "";
    }

    public String getId() {
        return token;
    }
}
