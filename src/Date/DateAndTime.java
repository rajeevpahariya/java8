package Date;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DateAndTime {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		try(
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(
								DateAndTime.class.getResourceAsStream("people.txt")));
				Stream<String> stream = reader.lines();
		){
			
			stream.map(line -> {
				String[] split = line.split(" ");
				String name = split[0];
				int year = Integer.parseInt(split[1]);
				Month month = Month.of(Integer.parseInt(split[2]));
				int day = Integer.parseInt(split[3]);
				Person p = new Person(name, LocalDate.of(year, month, day));
				list.add(p);
				return p;
			}).forEach(System.out::println);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		LocalDate date = LocalDate.now();
		list.stream().forEach(
				p -> {
					Period period = Period.between(p.getDob(), date);
					System.out.println(p.getName() + " was born " + 
					period.get(ChronoUnit.YEARS)+ " Years Ago, and "+
					period.get(ChronoUnit.MONTHS) + " months"+
					"("+ p.getDob().until(date, ChronoUnit.MONTHS)+ ")");
				});
	}
}
