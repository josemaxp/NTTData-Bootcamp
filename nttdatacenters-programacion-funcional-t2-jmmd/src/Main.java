import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(

				new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),

				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),

				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),

				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),

				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),

				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		System.out.println("\n-------------Total-------------\n");

		BigDecimal total = new BigDecimal(0);

		for (int i = 0; i < shoppingCart.size(); i++) {

			Double impuestos = (shoppingCart.get(i).price.doubleValue() * shoppingCart.get(i).getTax().percent / 100)
					+ shoppingCart.get(i).price.doubleValue();

			total = total.add(BigDecimal.valueOf(impuestos));
		}

		System.out.println(total.toString());

		System.out.println("\n-------------Listar-------------\n");

		shoppingCart.stream().filter(product -> product.name.startsWith("C"))
				.sorted(Comparator.comparing(Product::getName)).forEach(System.out::println);

	}
}
