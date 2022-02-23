import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Category mobile = new Category("mobile");
        Category Tv = new Category("TV");
        Category Pc = new Category("PC");

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(mobile,"samsung",20000));
        productList.add(new Product(mobile,"GLX",9000));
        productList.add(new Product(Tv,"LG",3000000));
        productList.add(new Product(Tv,"HP",2500000));
        productList.add(new Product(Pc,"Asus",40000));
        productList.add(new Product(Pc,"Dell",70000));


    }
}
