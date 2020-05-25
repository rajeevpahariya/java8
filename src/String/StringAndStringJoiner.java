package String;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class StringAndStringJoiner {
	public static void main(String[] args) {
		// String ex:
		String str1 = "Hello World!!";
		IntStream stream = str1.chars();
		stream.mapToObj(letter -> (char)letter)
				.map(Character::toUpperCase)
				.forEach(c -> System.out.println(c));
		
		// String Joiner : Earlier we were using String + or StringBuilder or StringBuffer
		
		StringJoiner joiner1 = new StringJoiner(" ,"); // delimeter
		joiner1.add("one").add("two").add("three");
		System.out.println(joiner1.toString());
		
		StringJoiner joiner2 = new StringJoiner(" ,", "{", "}"); // Delimeter with prefix and suffix
		joiner2.add("one").add("two").add("three");
		System.out.println(joiner2.toString());
		
		// We can also use the String join method.
		String str2 = String.join(", ", "one","two","three");
		System.out.println(str2);
		
		// Using array
		String[] strArray = {"one","two","three"};
		String str3 = String.join(", ", strArray);
		System.out.println(str3);
	}
}
