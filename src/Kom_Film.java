import java.util.ArrayList;

public class ASKom_Film extends Film{
    public ASKom_Film(String titel, int rel_year, int rating, ArrayList<String> cast, int price) {
        super(titel, rel_year, rating, cast, price);
    }
    public int get_askom_price(){
        return getPrice() + getPrice()/2;
    }
}
