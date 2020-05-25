package Stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamForEach {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one","two","three","four","five","six");
		// Print
		stream.forEach(s->System.out.println(s));
		
		// Filter so create the predicate
		Predicate<String> p1 = s->s.length()>3;
		Predicate<String> p2 = s->s.equals("two");
		Predicate<String> p3 = s->s.equals("six");
		
		// Print all with predicate 1
		stream
			.filter(p1)
			.forEach(s->System.out.println(s));
		
		stream
			.filter(p2.or(p3))
			.forEach(s->System.out.println(s));
		
		
	}
}
