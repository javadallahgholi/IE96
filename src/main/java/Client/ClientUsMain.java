package Client;

import Common.*;
import Server.ServerUsMain;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mashayekhi on 2/10/2017 AD.
 */

public class ClientUsMain {

    public static void main(String[] args) throws IOException {


    }

    public void searchForFlightPrices(Search search) throws IOException {
        Helper cToS = new Helper();
        Socket socket = cToS.connectToServer();

        //sending av request to server
        PrintWriter oos = new PrintWriter(socket.getOutputStream(),true);
//        System.out.println("AV query is: " +search.AV_query());
        oos.println(search.AV_query());

        //receiving response from server
        BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        FlightController flightController = FlightController.getMyInstance();
        Flight temp;
        String input1, input2;

//            while (bis.ready()){
        while( (input1 = bis.readLine() ) != null ){
//        while ((input1 = bis.readLine()) != null)
//            System.out.println(input1);

//        input1 = bis.readLine();
        input2 = bis.readLine();
//        System.out.println("input: " + input1 + input2);
        temp = new Flight(input1, input2);
//                flightController.addNewFlight(temp);
        flightController.addNewInstance(temp);
        temp.feedSeat();


            }

        String result = flightController.getFlightPricesForThisPassengers(search.getAdlultCount()
                , search.getChildCount(), search.getInfantCount());

        ServerUsMain s = new ServerUsMain();
        s.showClientFlightPrices(result);

        UIController uc = new UIController();
        uc.GetSearchResult(result);

    }

    public void getReservationObj(Reserve reserve) throws IOException {
        Helper cToS = new Helper();
        Socket socket = cToS.connectToServer();

        //sending res request to server

        PrintWriter oos = new PrintWriter(socket.getOutputStream());
        System.out.println("RES query is: " +reserve.RES_query());
        oos.println(reserve.RES_query());

        //receiving response from server
        BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Token token = new Token();
        String input = bis.readLine();
        String[] splitted = input.split("\\s+");

        token.setToken(splitted[0]);
        token.setAdultPrice(Integer.parseInt(splitted[1]));
        token.setChildPrice(Integer.parseInt(splitted[2]));
        token.setInfantPrice(Integer.parseInt(splitted[3]));

        int totalPrice = token.getTotalPrice();
        String tokenResult = token.getToken();

        ReservationController.getMyInstance().addNewInstance(reserve);

//        //inja peyda mishe kodoom token male kodoom reserve
//        Reserve dick = ReservationController.getMyInstance().findInstanceById(tokenResult);


        ServerUsMain s = new ServerUsMain();
        s.showClientTokenPrice(tokenResult, totalPrice);
    }
}


