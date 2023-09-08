package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;

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
		LocalDate nowDate = LocalDate.now();
		String s = nowDate.toString();
		String newDir = "C:\\mywork\\" + s.substring(0,4)+s.substring(5,7)+s.substring(8)+"file";
		System.out.println(newDir);
		File file = new File(newDir);
		
		if(!file.exists()) {
			file.mkdir(); 
			System.out.println("폴더 생성 완료 !");
		} else {
			System.out.println("해당 폴더가 존재합니다만 test 는 진행합니다. ");
		}

		System.out.print("파일명을 .txt 형식으로 입력하세요.\n");
		String fileName = sc.next();
		sc.nextLine();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String str;
		String[] strT = new String[100];
		int count = 0 ;
		try {
			fw = new FileWriter(newDir+"\\"+fileName);
			bw = new BufferedWriter(fw);
			
			while(true) {
				System.out.print("내용을 입력하세요 :  ");
				System.out.print("<그만>입력시 파일내용이 출력됩니다. : ");
				str = sc.nextLine();
				if(str.equals("그만")) break;
				
				strT[count] = str;
				bw.write(str + "\r\n");
				System.out.println("파일 정상 입력 완료!");
				count ++;
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
		for(int i=0 ; i< count ; i++) {
			System.out.println(strT[i]);
		}
	}

}
