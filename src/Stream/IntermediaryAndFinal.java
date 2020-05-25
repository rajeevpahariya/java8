package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one","two","three","four","five","six");
		Predicate<String> p1 = s->s.equals("two");
		Predicate<String> p2 = s->s.equals("six");
		List<String> list = new ArrayList<String>();
		
//		stream
//			.peek(System.out::println)
//			.filter(p1.or(p2))
//			.peek(list::add); // Intermediary method and return nothing.
		
		stream
			.peek(System.out::println)
			.filter(p1.or(p2))
			.forEach(list::add);
		
		System.out.println("DONE");
		System.out.println("Size:: "+ list.size());
		// above output has zero size mean forEach doesn't return anything.
		// Change peek to forEach wich is final method.
		
		
		
	}
}
