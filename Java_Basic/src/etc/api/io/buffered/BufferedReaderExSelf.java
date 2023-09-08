package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExSelf {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader("C:/mywork/hello.txt");
			br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
