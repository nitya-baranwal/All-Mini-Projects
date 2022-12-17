package q1;

public class Product implements Comparable<Product>{

    String productName;
    double productPrice;

    Product() {}

    public Product(String name, double price) {
        this.productName = name;
        this.productPrice = price;
    }

    @Override
    public int compareTo(Product o) {
        if(this.productPrice ==  o.productPrice){
            return 0;
        } else if(this.productPrice > o.productPrice){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
