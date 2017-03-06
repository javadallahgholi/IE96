package Common;

import Client.ClientUsMain;
import Server.ServerUsMain;

import java.io.IOException;

/**
 * Created by j-ghazvne on 2/13/17.
 */
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

    public void GetSearchResult(String Result){
        ServerUsMain s = new ServerUsMain();
        s.showClientFlightPrices(Result);
    }
}
