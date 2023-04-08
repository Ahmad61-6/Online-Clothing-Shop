package Products;
import java.util.ArrayList;
public class Product_Server {
    ArrayList<Product> t_shirt = new ArrayList<>();
    ArrayList<Product> jeans = new ArrayList<>();
    ArrayList<Product> polo_shirt = new ArrayList<>();
    ArrayList<Product> full_sleve_shirt = new ArrayList<>();
    ArrayList<Product> trousers = new ArrayList<>();
    ArrayList<Product> casual_shirt = new ArrayList<>();

    //t_shirts
    public void t_shirt(){
        t_shirt.add(new T_shirt(" "," "," "," "));
    }
    public void jeans(){
        jeans.add(new Jeans("","","",""));
    }

    public void full_sleve_shirt(){
        full_sleve_shirt.add(new Full_sleve_shirt("","","",""));
    }
    public void trousers (){
        trousers .add(new Trousers("","","",""));
    }
    public void casual_shirt(){
        casual_shirt.add(new Casual_shirt("","","",""));
    }
    public void polo_shirt(){
        polo_shirt.add(new Polo_shirt("","","",""));
    }

}
