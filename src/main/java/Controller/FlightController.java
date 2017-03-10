package Controller;
import Common.Flight;

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
            result += current.showSearchResult() + "\n";
            result += current.getPriceForThisPassengers(adult_no,child_no,infant_no) + "\n***\n";
        }
        return result.substring(0,result.length()-4);
    }
}
