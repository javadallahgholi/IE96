package Server;

import Client.ClientUsMain;
import Common.Passenger;
import Common.Reserve;
import Common.Search;
import Common.Token;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Pipe;
import java.text.ParseException;
import java.util.List;

/**
 * Created by Mashayekhi on 2/10/2017 AD.
 */
public class ServerUsMain {
    public static void main(String[] args) throws IOException , ClassNotFoundException , ParseException {
        ServerSocket server = new ServerSocket(1234);
        Socket socket = server.accept();
        System.out.println("server is listening ...");
//        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        BufferedReader bis = new BufferedReader(new InputStreamReader( socket.getInputStream()));
        {
            String input = bis.readLine();
            String[] splited = input.split("\\s+");
            String tmp;
            if (splited[0].equals("search")){
                System.out.println("in search");
                Search search = new Search();
                tmp = splited[1];
                search.setOriginCode(tmp);
                tmp = splited[2];
                search.setDestinationCode(tmp);
                tmp = splited[3];
                search.setDate(tmp);
                tmp = splited[4];
                search.setAdlultCount(Integer.parseInt(tmp));
                tmp = splited[5];
                search.setChildCount(Integer.parseInt(tmp));
                tmp = splited[6];
                search.setInfantCount(Integer.parseInt(tmp));

                ClientUsMain c = new ClientUsMain();
                c.searchForFlightPrices(search);

                System.out.println("Object Search is created");
            }
            if (splited[0].equals("reserve")) {
                Reserve reserve = new Reserve();
                tmp = splited[1];
                reserve.setOriginCode(tmp);
                tmp = splited[2];
                reserve.setDestinationCode(tmp);
                tmp = splited[3];
                reserve.setDate(tmp);
                tmp = splited[4];
                reserve.setAirlineCode(tmp);
                tmp = splited[5];
                reserve.setFlightNo(Integer.parseInt(tmp));
                tmp = splited[6];
                reserve.setSeatType(tmp);
                tmp = splited[7];
                reserve.setAdlultCount(Integer.parseInt(tmp));
                tmp = splited[8];
                reserve.setChildCount(Integer.parseInt(tmp));
                tmp = splited[9];
                reserve.setInfantCount(Integer.parseInt(tmp));

                //next line for name family name
                int pass = reserve.getAdlultCount() + reserve.getChildCount() + reserve.getInfantCount();
                List<Passenger> passengers = null;
                for (int i = 0 ; i < pass ; i++){
                    String passInput = bis.readLine();
                    String[] passInfo = passInput.split("\\s+");
                    String temp = null;
                    Passenger passenger = new Passenger();
                    temp = passInfo[0];
                    passenger.setFirst(temp);
                    temp = passInfo[1];
                    passenger.setLast(temp);
                    temp = passInfo[2];
                    passenger.setId(Integer.parseInt(temp));
                    passengers.add(passenger);
                }

                ClientUsMain c = new ClientUsMain();
                c.getReservationObj(reserve);

                System.out.println("Object Reserve is created");
            }

            if (splited[0].equals("finalize")) {
                Token token = new Token();
            }

//            if (splited[0].equals("reserve")){
//                Flight flight = new Flight();
//                tmp = splited[1];
//                flight.setOrigin_code(tmp);
//                tmp = splited[2];
//                flight.setDestination_code(tmp);
//                tmp = splited[3];
//                flight.setDate(tmp);
//                tmp = splited[4];
//                flight.setAirline_code(tmp);
//                tmp = splited[5];
//                flight.setFlight_no(Integer.parseInt(tmp));
//                tmp = splited[6];
//                flight.setSeat_class(tmp);
//                tmp = splited[7];
//                flight.setAdult(Integer.parseInt(tmp));
//                tmp = splited[8];
//                flight.setChild(Integer.parseInt(tmp));
//                tmp = splited[9];
//                flight.setInfant(Integer.parseInt(tmp));
//
//                //next line for name family name
//
//                List<Passenger> passengers = null;
//                for (int i = 0 ; i < flight.getAdult() + flight.getChild() + flight.getInfant() ; i++){
//                    String passInput = bis.readLine();
//                    String[] passInfo = passInput.split("\\s+");
//                    String temp = null;
//                    Passenger passenger = new Passenger();
//                    temp = passInfo[0];
//                    passenger.setFirst(temp);
//                    temp = passInfo[1];
//                    passenger.setLast(temp);
//                    temp = passInfo[2];
//                    passenger.setId(Integer.parseInt(temp));
//                    passengers.add(passenger);
//                }
//
//                Reservation reservation = new Reservation();
//                reservation.setFlight(flight);
//                reservation.setPassengers(passengers);
//
//
//                ClientUsMain c = new ClientUsMain();
//                c.getReservationObj(reservation);
//
//            }

        }

        socket.close();
        server.close();
    }

    public void showClientFlightPrices(String result){
        System.out.println(result);
    }
    public void showClientTokenPrice(String token, int totalPrice){
        System.out.println(token + " " + totalPrice);
    }
}
