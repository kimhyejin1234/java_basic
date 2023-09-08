package etc.api.lang.wrapper;

import java.time.LocalDate;
import java.util.Scanner;

import oop.inter.basic.ParentInter;

public class ParseQuizTeacher {
    /*
	패키지: etc.api.lang.wrapper
	클래스이름: ParseQuiz


	주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

	ex) 입력값: 9201013-1234567
	출력값: 1992년 10월 13일 31세 남자 

	입력값: 040906-4123456
	출력값: 2004년 9월 6일 19세 여자 

	입력값은 하이픈이 포함된 문자열이어야 합니다. 
	하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
	또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input ;
		String gender ;
		char c ;
		
		while(true) {
			System.out.print("주민번호를 입력하세요.하이폰 포함하여 입력하세요 : ");
			input = sc.next();
			
			if(input.indexOf("-") == -1) {
				System.out.println("주민번호는 하이폰를  입력 해야 합니다.");
				continue;
			}
			
			c = input.charAt(7);
			if(c == '1' || c == '3' || c == '5') {
				gender = "남자";
			} else if(c == '2' || c == '4' || c == '6') {
				gender = "여자";
			} else {		
				System.out.println("주민 번호 성별 입력 오류 입니다. ");
				continue;
			}
			if(input.length() != 14) {
				System.out.println("올바른 주민번호 형태가 아닙니다.");
				continue;
			}
			
			try {
				String test = input.substring(0,6);
				String test2 = input.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자로 정확하게 입력하셔야 합니다.");
			}
			
		}
		
		int year = Integer.parseInt(input.substring(0,2));
		int month = Integer.parseInt(input.substring(2,4));
		int day = Integer.parseInt(input.substring(4,6));

		if(c == '1' || c == '2' ) {
			year += 1900;
		} else {
			year += 2000;
		}
		int age = LocalDate.now().getYear() - year;
		
		System.out.printf("%d 년 %d월 %d일 %d세 %s ",year,month,day,age,gender);
		sc.close();
	}
}
