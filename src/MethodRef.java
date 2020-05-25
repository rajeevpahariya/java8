import java.util.function.Consumer;

public class MethodRef {
	public static void main(String[] args) {
		Consumer<String> conLambda = s-> System.out.println(s);
		conLambda.accept("Lambda");
		
		Consumer<String> conMethodRef = System.out::println;	
		conMethodRef.accept("Methdo Ref Ex");
	}
}
