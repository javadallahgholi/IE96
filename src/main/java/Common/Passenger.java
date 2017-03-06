package Common;

import java.io.Serializable;

/**
 * Created by Mashayekhi on 2/10/2017 AD.
 */

public class Passenger implements Serializable {
    private String first , last;
    private  int id;

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getId() {
        return id;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return getFirst() + " " + getLast() + " " + getId() ;
    }
}
