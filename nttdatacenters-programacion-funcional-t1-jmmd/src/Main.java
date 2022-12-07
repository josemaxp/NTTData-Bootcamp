import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		System.out.println(numbers);

		System.out.println("\n-------------Imperativo-------------\n");

		for (Integer integer : numbers) {
			if (integer > 10) {
				System.out.println(integer + " es mayor que 10");
			}
		}
		
		System.out.println("\n-------------Funcional-------------\n");
		

		Stream<Integer> numbers1 = numbers.stream().filter( number -> number > 10);
		
		numbers1.forEach(System.out::println);

	}

}
