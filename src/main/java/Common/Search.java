package Common;

/**
 * Created by Mashayekhi on 2/12/2017 AD.
 */
public class Search {
    private String originCode;
    private String destinationCode;
    private String date;
    private int adlultCount , childCount , infantCount;

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAdlultCount() {
        return adlultCount;
    }

    public void setAdlultCount(int adlultCount) {
        this.adlultCount = adlultCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getInfantCount() {
        return infantCount;
    }

    public void setInfantCount(int infantCount) {
        this.infantCount = infantCount;
    }

    public String AV_query() {return "AV " + originCode + " " + destinationCode + " " + date; }

    public int passengerCount(int adlultCount , int childCount , int infantCount){
        return adlultCount + childCount + infantCount;
    }
}
