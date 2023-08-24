package basic.begin;

//1. Scanner api 로딩(제공되는 Scanner 정보를 현재 클래스로 가져오기)
import java.util.Scanner;

import java.util.Date;


public class ScannerQuiz {

	public static void main(String[] args) {
		/*
		- 스캐너를 사용하여 이름과 나이를 입력받아서

		이름: XXX
		나이: XX세
		출생년도: XXXX년

		을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
		출생년도는 입력사항이 아닙니다.)
		*/
		
		// 현재 년도 가져오기
		Date dt=new Date();
		int year=dt.getYear();
        int current_Year=year+1900;
		//
        
        
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		int birthYear = current_Year - age ;
		
		System.out.println("=======================");
		System.out.printf("이름 : %s \n",name);
		System.out.printf("나이 : %d 세\n",age);
		System.out.printf("출생년도 : %d 년 \n",birthYear);
		System.out.println("=======================");
		
	
		sc.close();


	}

}
