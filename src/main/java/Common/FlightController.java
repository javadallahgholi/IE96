package Common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mashayekhi on 2/11/2017 AD.
 */
public class FlightController extends Controller<Flight> {
    private static FlightController myInstance = new FlightController();

    private FlightController(){
        super();
    }


    public static FlightController getMyInstance(){
        return myInstance;
    }


    public String getFlightPricesForThisPassengers(int adult_no, int child_no, int infant_no){
        String result = "";
        for(Flight current: mapper.values()){
            result += current.getFlightInfo() + "\n";
            result += current.getPriceForThisPassengers(adult_no,child_no,infant_no) + "\n***\n";
        }

//        System.out.println("Result is:" +result);
//        System.out.println("Mapper size is:" +mapper.size());

        return result.substring(0,result.length()-4);
    }
}
