package Controller;

public class ReserveController {

    private static ReserveController myInstance = new ReserveController();

    private ReserveController(){
        super();
    }

    public static ReserveController getMyInstance(){
        return myInstance;
    }

}
