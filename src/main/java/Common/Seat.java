package Common;

import java.io.*;
import java.net.Socket;

/**
 * Created by Mashayekhi on 2/11/2017 AD.
 */

public class Seat {
    private char seatType;
    private char seatCount;
    private int flight_no;
    private int adult_price , child_price , infant_price;

    public Seat(int flight_no, char seatType , char seatCount) throws IOException {
        this.flight_no = flight_no;
        this.seatType = seatType;
        this.seatCount = seatCount;
        //sending price query to server
//        String query = FlightController.getMyInstance().findFlightById(flight_no).PRICE_query();
        String query = FlightController.getMyInstance().findInstanceById(String.valueOf(flight_no)).PRICE_query();
//        Controller c = new Controller();
//        String query = c.findInstanceById(String.valueOf(flight_no)).getId().
        Helper cToS = new Helper();
        Socket socket = cToS.connectToServer();

        PrintWriter oos = new PrintWriter(socket.getOutputStream(),true);
        query = query.substring(0,query.length()-4) + seatType;
        oos.println(query);
//        System.out.println(query);


        //receiving price respond from server
        BufferedReader bis = new BufferedReader(new InputStreamReader( socket.getInputStream()));
        String price_input = bis.readLine();
        String[] splitted = price_input.split("\\s+");
        adult_price = Integer.parseInt(splitted[0]);
        child_price = Integer.parseInt(splitted[1]);
        infant_price = Integer.parseInt(splitted[2]);

    }

    public String calculatedPrice(int adult_no , int child_no , int infant_no){
        int passengerCount = adult_no + child_no + infant_no;
        if (seatCount == 'C')
            return "There is no Seat";
        if (seatCount == 'A') {
            return String.format("Class: %c Price: %d", seatType,
                    adult_no * adult_price + child_no * child_price + infant_no * infant_price);
        }
        else {
            int count = Character.getNumericValue(seatCount);
            if (count > passengerCount){
                seatCount = (char) (count - passengerCount);
                return String.format("Class: %c Price: %d", seatType,
                        adult_no * adult_price + child_no * child_price + infant_no * infant_price);
            }
            else
                return "There is no Seat left";

        }

    }
}
