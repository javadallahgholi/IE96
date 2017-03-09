package Common;

/**
 * Created by j-ghazvne on 2/12/17.
 */
public class Token {
    private String token;
    private int adultPrice, childPrice, infantPrice;
    private Reserve reserve;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }

    public int getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(int childPrice) {
        this.childPrice = childPrice;
    }

    public int getInfantPrice() {
        return infantPrice;
    }

    public void setInfantPrice(int infantPrice) {
        this.infantPrice = infantPrice;
    }

    public Reserve getReserve() {
        return reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    public int getTotalPrice() {
        return adultPrice + childPrice + infantPrice;
    }

    public String FIN_query() {return "FIN " + token; }

}
