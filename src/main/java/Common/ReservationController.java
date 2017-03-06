package Common;

/**
 * Created by Mashayekhi on 2/12/2017 AD.
 */
public class ReservationController extends Controller<Reserve>{
    private static ReservationController myInstance = new ReservationController();

    private ReservationController(){
        super();
    }

    public static ReservationController getMyInstance(){
        return myInstance;
    }

}
