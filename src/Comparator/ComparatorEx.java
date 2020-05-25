package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	public static void main(String[] args) {
		Student s1 = new Student("Rajeev", "Gupta");
		Student s2 = new Student("Amar", "Nikhra");
		Student s3 = new Student("Manish", "Dubey");
		Student s4 = new Student("Swadesh", "Gupta");
		Student s5 = new Student("Sandeep", "Gautam");
		Student s6 = new Student("Raju", "Daure");
		Student s7 = new Student("Raju", "Datre");
		List<Student> list1 = Arrays.asList(s1,s2,s3,s4,s5,s6);
		List<Student> list2 = Arrays.asList(s1,s2,s3,s4,s5,s6);
		List<Student> list3 = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		List<Student> list4 = Arrays.asList(s1,s2,s3,s4,s5,s6);
		List<Student> list5 = Arrays.asList(s1,s2,s3,s4,s5,s6);
		List<Student> list6 = Arrays.asList(s1,s2,s3,s4,s5,s6);
		
		// OLD Comparator
		Comparator<Student> comp1 = new Comparator<Student>() {
			@Override
			public int compare(Student var1, Student var2) {
				return var1.getFirstName().compareTo(var2.getFirstName());
			}
		};
		Collections.sort(list1, comp1);
		list1.forEach(System.out::println);
		
		System.out.println("============================= NEW1 ================== ");
		// new API
		Comparator<Student> comp2 = Comparator.comparing(Student::getFirstName);
		Collections.sort(list2, comp2);
		list2.forEach(System.out::println);
		
		// Chaining Comparator
		System.out.println("============================= Chaining ================== ");
		Comparator<Student> comp3 = Comparator.comparing(Student::getFirstName).
												thenComparing(Student::getLastName);
		Collections.sort(list3, comp3);
		list3.forEach(System.out::println);
		
		// Reversed
		
		System.out.println("============================= Reversed ================== ");
		Comparator<Student> comp4 = Comparator.comparing(Student::getFirstName);
		Comparator<Student> reversed = comp4.reversed();
		Collections.sort(list4, reversed);
		list4.forEach(System.out::println);
		
		// Natural Order
		System.out.println("============================= Natural Order ================== ");
		// Only for comparablel objects
		Comparator<String> comp5 = Comparator.naturalOrder();
//		Comparator<Student> comp5 = Comparator.comparing(Student::getFirstName);
//		Comparator<Student> reversed = comp5.na;
//		Collections.sort(list4, reversed);
//		list4.forEach(System.out::println);
//		
	}
}
