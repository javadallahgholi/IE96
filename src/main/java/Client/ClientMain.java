//package Client;
//
//import Common.Flight;
//import Common.Passenger;
//import Common.Reservation;
//
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.net.Socket;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Created by Mashayekhi on 2/10/2017 AD.
// */
//public class ClientMain {
//    public static void main(String[] args) throws IOException{
//        Socket socket = new Socket("localhost" , 1234);
//        Scanner scan = new Scanner(System.in);
//        String input = scan.next();
//        if (input.equals("search")){
//            Flight flight = new Flight();
//            input = scan.next();
//            flight.setOrigin_code(input);
//            input = scan.next();
//            flight.setDestination_code(input);
//            input = scan.next();
//            flight.setDate(input);
//            input = scan.next();
//            flight.setAdult(Integer.parseInt(input));
//            input = scan.next();
//            flight.setChild(Integer.parseInt(input));
//            input = scan.next();
//            flight.setInfant(Integer.parseInt(input));
//
//            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//            oos.writeObject(flight);
//
//            System.out.println("Object Flight is created");
//        }
//
//        else if (input.equals("reserve")){
//            Flight flight = new Flight();
//            input = scan.next();
//            flight.setOrigin_code(input);
//            input = scan.next();
//            flight.setDestination_code(input);
//            input = scan.next();
//            flight.setDate(input);
//            input = scan.next();
//            flight.setAirline_code(input);
//            input = scan.next();
//            flight.setFlight_no(Integer.parseInt(input));
//            input = scan.next();
//            flight.setSeat_class(input);
//            input = scan.next();
//            flight.setAdult(Integer.parseInt(input));
//            input = scan.next();
//            flight.setChild(Integer.parseInt(input));
//            input = scan.next();
//            flight.setInfant(Integer.parseInt(input));
//
//
//            List<Passenger> passengers = null;
//            for (int i = 0 ; i < flight.getAdult() + flight.getChild() + flight.getInfant() ; i++){
//                Passenger passenger = new Passenger();
//                input = scan.next();
//                passenger.setFirst(input);
//                input = scan.next();
//                passenger.setLast(input);
//                passenger.setId(Integer.parseInt(input));
//                passengers.add(passenger);
//            }
//
//            Reservation reservation = new Reservation();
//            reservation.setFlight(flight);
//            reservation.setPassengers(passengers);
//
//            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//            oos.writeObject(reservation);
//
//            System.out.println("Object reservation is created");
//
//        }
//
//
//        socket.close();
//    }
//}
