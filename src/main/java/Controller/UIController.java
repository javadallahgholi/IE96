package Controller;
import Client.ClientUsMain;
import Common.Search;
import java.io.IOException;

public class UIController {

    public void searchFlight(String originCode, String destinationCode, String date,
                        int adultCount, int childCount, int infantCount) throws IOException{
        Search search = new Search();
        search.setOriginCode(originCode);
        search.setDestinationCode(destinationCode);
        search.setDate(date);
        search.setAdlultCount(adultCount);
        search.setChildCount(childCount);
        search.setInfantCount(infantCount);

        ClientUsMain c = new ClientUsMain();
        c.searchForFlightPrices(search);
    }
}
