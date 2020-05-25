import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","four","five");
		List<String> result = new ArrayList<String>();
		
		Consumer<String> c1 = s->System.out.println(s); // System.out::println
		Consumer<String> c2 = s->result.add(s); // result::add  : This will add string to result
		list.forEach(c1.andThen(c2)); // chain of consumers
		// verify if result is populated
		System.out.println("Length of result :: "+ result.size());
	}
}
