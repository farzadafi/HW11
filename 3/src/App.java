import java.util.ArrayList;
import java.util.Date;
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

        /*
        productList.stream()
                .filter(product -> product.getCategory().equals(Pc))
                .forEach(product -> System.out.println(product.toString()));
         */

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(new Customer("Farzad"),new Product(mobile,"samsung",20000),new Date(2012,1,10)));
        orderList.add(new Order(new Customer("Farzad"),new Product(mobile,"samsung",20000),new Date(2012,1,10)));
        orderList.add(new Order(new Customer("Amin"),new Product(Tv,"LG",20000),new Date(2014,10,15)));
        orderList.add(new Order(new Customer("Reza"),new Product(Pc,"Asus",20000),new Date(2021,9,10)));
        Date dateAfter  = new Date(2010,10,10);
        Date dateBefore = new Date(2020,10,10);


    }
}
