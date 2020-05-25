import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader {
	public static void main(String[] args) {
		String s = "";
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("type xyz to exit");
			s = br.readLine();
			while(s != null){
				System.out.println("Input Data :"+ s.trim() );
				if(s.equals("xyz")){
					System.exit(0);
				}
				System.out.println("type xyz to exit");
				s = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
