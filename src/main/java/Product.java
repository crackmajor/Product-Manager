//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Product {
    protected int id;
    protected String productName;
    protected int price;

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

}
