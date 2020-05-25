import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda{
	
	public static void main(String[] args) throws InterruptedException {
		
		// Reading File Using the FileFilter API using anonymous class
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File fileName) {
				return fileName.getName().equals("java");
			}
		};
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=3;i++){
					System.out.println("Thread Code   "+ Thread.currentThread().getName());
				}
				
			}
		};
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		//  END 
		
		// Above example with Lambda Expression
		FileFilter lambdaFilter = (File pFile) -> pFile.getName().equals("java");
		//OR
		FileFilter lambdaFilter2 = (file) -> file.getName().equals("java");
		Runnable lambdaRunnable = () -> {
			for(int i=1;i<=3;i++){
				System.out.println("Thread Lambd Code   "+ Thread.currentThread().getName());
			}
		};
		Comparator<String> lambdaComp = (o1,o2) ->  Integer.compare(o2.length(), o1.length());
		// End
		
		File file = new File("D:/Rajeev Gupta/CodePC/DataForCode");
		File[] listFiles = file.listFiles();
		for(File lFile : listFiles){
			System.out.println(fileFilter.accept(lFile));
			System.out.println(lambdaFilter.accept(lFile));
			System.out.println(lambdaFilter2.accept(lFile));
		}
		
		Thread td = new Thread(runnable);
		td.start();
		td.join();
		
		Thread ltd = new Thread(lambdaRunnable);
		ltd.start();
		ltd.join();
		
		List<String> list = Arrays.asList("**","***","*","****");
		Collections.sort(list,comp);
		for(String s : list){
			System.out.println(s);
		}
		Collections.sort(list,lambdaComp);
		for(String s : list){
			System.out.println(s);
		}
	}
}
