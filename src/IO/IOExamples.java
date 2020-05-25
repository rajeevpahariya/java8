package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOExamples {
	public static void main(String[] args) {
		
		// One way
		try(BufferedReader reader = new BufferedReader(
				new FileReader(new File("D:/Rajeev Gupta/CodePC/JAVA8/Java8/src/IO/debug.txt")))) 
		{
			Stream<String> lines = reader.lines();
			lines.filter(line -> line.contains("COVID-19"))
					.findFirst().ifPresent(System.out::println);
			reader.lines().filter(line -> line.contains("COVID-19"))
					.forEach(System.out::println);
			reader.lines().forEach(System.out::println);
			
		} catch (Exception e) {
			
		}
		
		// 2nd way and simple too.
		
		Path path = Paths.get("D:", "Rajeev Gupta","CodePC", "JAVA8","Java8", "src","IO", "debug.txt");
		try(Stream<String> stream = Files.lines(path)){
			stream.forEach(str -> System.out.println(str));
		}catch (Exception e) {
			
		}
		
		// Directories 
		
		Path path1 = Paths.get("D:", "Rajeev Gupta","CodePC", "JAVA8","Java8", "src");
		try(Stream<Path> stream = Files.list(path1)){
			stream.filter(dir -> dir.toFile().isDirectory())
					.forEach(System.out::println);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("=========================== WALK =======================");
		Path path2 = Paths.get("D:", "Rajeev Gupta","CodePC", "JAVA8","Java8");
		try(Stream<Path> stream = Files.walk(path2)){
			stream.filter(dir -> dir.toFile().isDirectory())
					.forEach(System.out::println);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("=========================== Depth WALK =======================");
		try(Stream<Path> stream = Files.walk(path2,1)){ // 1 will limit the depth of dir.
			stream.filter(dir -> dir.toFile().isDirectory())
					.forEach(System.out::println);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
