package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {


		/*
         1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
          파일을 작성합니다. 
          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
           연결해 주시면 됩니다.)
                각 문장은 줄 개행을 포함합니다.
         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
          파일을 읽어서 콘솔에 출력해 보세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		//오늘 날짜 20230908file 이라는 이름으로 폴더를 생성
		LocalDate nowDate = LocalDate.now();
		int year = nowDate.getYear();
		int month = nowDate.getMonthValue();
		int day = nowDate.getDayOfMonth();
		int s = year*10000 + month*100 + day;
		System.out.println(s);
	    
		String newDir = "C:\\mywork\\" + s +"file";
		System.out.println(newDir);
		File file = new File(newDir);
		
		if(!file.exists()) {
			file.mkdir(); 
			System.out.println("폴더 생성 완료 !");
		} else {
			System.out.println("해당 폴더가 존재합니다만 test 는 진행합니다. ");
		}

		//스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다
		System.out.print("파일명을 .txt 형식으로 입력하세요.\n");
		System.out.print(">");
		String fileName = sc.next();
		sc.nextLine();
		
		// 입력받은 내용으로 file  write
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(newDir+"\\"+fileName);
			bw = new BufferedWriter(fw);
			
			while(true) {
				System.out.println("내용을 입력하세요 :  ");
				System.out.print("<그만>입력시 파일내용이 출력됩니다. : ");
				System.out.print(">");
				String str = sc.nextLine();
				if(str.equals("그만")) break;
				
				bw.write(str + "\r\n");
				System.out.println("파일 정상 입력 완료!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//*********************************
		//저장 되어 있는 file read
		//*********************************
		
		System.out.println("=== 파일 내용을 출력합니다. ===");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(newDir+"\\"+fileName);
			br = new BufferedReader(fr);
			String str ;
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
		System.out.println("=== 출력 완료 . ===");
		
	}

}
