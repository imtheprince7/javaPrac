package Java8_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
     int productId;
     String productName;
     int productPrice;

     Product(){

     }
    Product(int productId, String productName,int productPrice){
        this.productId = productId ;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}


public class FilterDemoObject {


// *****************  By defalt Stream process the data(object) SEQUENTIALLY **************************
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
            new Product(1,"Dell",18000),
            new Product(1,"Lenevo",23000),
            new Product(3,"HP",16000),
            new Product(4,"Sony",35000),
            new Product(5,"Apple",90000),
            new Product(6,"Micorsoft",95000));

        productList.stream().filter(n-> n.productId >35000).forEach(pr -> System.out.print(pr.productName));
    }
}
