package Common;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Mashayekhi on 2/12/2017 AD.
 */
public class Helper {
    public Socket connectToServer() throws IOException{
        return new Socket("188.166.78.119" , 8081);
    }
}
