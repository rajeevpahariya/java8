package Stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		try(
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(
									Collector.class.getResourceAsStream("people.txt")));
			Stream<String> stream = reader.lines();
		) {
			stream.map(line -> {
				String[] split = line.split(" ");
				Person p = new Person();
				p.setName(split[0].trim());
				p.setAge(Integer.parseInt(split[1]));
				persons.add(p);
				return p;
			}).forEach(System.out::println);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		//Stream<Person> stream = persons.stream();
		Optional<Person> min = persons.stream().filter(p-> p.getAge() >=20)
					.min(Comparator.comparing(Person::getAge));
		System.out.println(min);
		
		//Stream<Person> stream = persons.stream();
		Optional<Person> max = persons.stream().filter(p-> p.getAge() >=20)
				.max(Comparator.comparing(Person::getAge));
		System.out.println(max);
		
		Map<Integer, List<Person>> map1 =
				persons.stream()
					.collect(
							Collectors.groupingBy(Person::getAge));
		System.out.println(map1);
		
		Map<Integer, Long> map2 =
				persons.stream()
					.collect(
							Collectors.groupingBy(
									Person::getAge,
									Collectors.counting() // downstream collector
							));
		System.out.println(map2);
		
		Map<Integer, Collection<String>> map3 =
				persons.stream()
					.collect(
							Collectors.groupingBy(
									Person::getAge,
									Collectors.mapping(Person::getName, 
											Collectors.toCollection(TreeSet::new)) // downstream collector
							));
		System.out.println(map3);
		
		Map<Integer, String> map4 =
				persons.stream()
					.collect(
							Collectors.groupingBy(
									Person::getAge,
									Collectors.mapping(Person::getName, 
											Collectors.joining(", ")) // downstream collector
							));
		System.out.println(map4);
	}
}
