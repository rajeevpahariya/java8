package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapAndFlatMap {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2,4,6);
		List<Integer> list3 = Arrays.asList(3,5,7);
		
		List<List<Integer>> list = Arrays.asList(list1,list2,list3);
		
		System.out.println(list);
		
		// Print lenght Using the map
		
		list.stream()
				.map(l->l.size())
				.forEach(System.out::println);
		
		// Lets define the function for size
		Function<List<?>, Integer> size = List::size;
		// Lets define the function for flatmap
		Function<List<Integer>, Stream<Integer>> flatMap =
					l->l.stream();
		
		list.stream()
				.map(size)
				.forEach(System.out::println);
		
		// Now pass the flatMap instead of size function. it will print the 3 stream
		
		list.stream()
				.map(flatMap)
				.forEach(System.out::println);
		
		// Instead of calling the map, now call the flatMap, which will flatten the all the 
		// 3 stream to single stream
		
		list.stream()
				.flatMap(flatMap)
				.forEach(System.out::println);
		
	}
}
