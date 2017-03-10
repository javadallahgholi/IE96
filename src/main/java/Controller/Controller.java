package Controller;
import java.util.HashMap;
import java.util.Map;

public class Controller<T extends ControllerNode> {
    protected Map<String , T> mapper;

    protected Controller(){
        mapper = new HashMap<String, T>();
    }

    public void addNewInstance(T t){
        // TODO pre processs
        mapper.put(t.getId(), t);
    }

    public T findInstanceById(String flightId){
        // TODO use copy constructor to create new flight
        return mapper.get(flightId);
    }

/*
    public String getFlightPricesForThisPassengers(int adult_no , int child_no , int infant_no){
        String result = "";
        for(T current: mapper.values()){
            result += current.getPriceForThisPassengers(adult_no,child_no,infant_no) + "\n***";
        }

        return result.substring(0,result.length()-4);
    }
    */
}
