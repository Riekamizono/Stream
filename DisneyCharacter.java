import java.util.List;

public class DisneyCharacter {

	public static void main(String[] args) {
		List<String> names = List.of("mickey", "minnie", "donald", "pooh", "duffy");
		names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}