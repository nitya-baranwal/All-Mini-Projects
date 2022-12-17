package q2;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1,"pen",200,4));
		products.add(new Product(2,"pencil",15,4));
		products.add(new Product(3,"rubber",20,4));
		products.add(new Product(4,"sharpner",25,4));
		products.add(new Product(5,"scale",20,4));
		products.add(new Product(6,"compass",20,4));
		
		products.removeIf(p -> p.getQuantity() < 2);
		Collections.sort(products, (p1,p2) -> p2.getPrice() - p1.getPrice());
		
		Intr i = Main::print;
		
	    i.printList(products);
		}
		public static void print(List<Product> list) {
			System.out.println(list);
		}
}
