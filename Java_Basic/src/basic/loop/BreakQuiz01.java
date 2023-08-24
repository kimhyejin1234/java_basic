package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아래 식의 답을 입력하세요.");
		System.out.print("종료를 원하시면 0 을 입력하세요. : ");
		
		int ok = 0;
		int err = 0;
		int input = 0;
		int rn1 = 0;
		int rn2 = 0;
		while(true) {
			rn1 = (int) ((Math.random()*100) + 1) ;
			rn2 = (int) ((Math.random()*100) + 1) ;
			System.out.printf("%d + %d = ???" , rn1 , rn2);
			System.out.print("\n> ");
			input = sc.nextInt();
			if(input == rn1 + rn2) {
				System.out.println("정답입니다.!!");
				ok ++;
			} else if(input == 0) {
				System.out.println("종료합니다.!!");
				break;
			} else {
				System.out.println("틀렸습니다.!!");
				err ++;
			}
			
		}
		System.out.println("---------------------");
		System.out.println("정답 횟수 :" + ok + "회");
		System.out.println("오답 횟수 :" + err + "회");
		System.out.println("---------------------");
		
		
		// 위의 문제를 덧샘과 뺄셈을 반복해 작성하세요.
		ok = 0;
		err = 0;
		input = 0;
		while(true) {
			rn1 = (int) ((Math.random()*100) + 1) ;
			rn2 = (int) ((Math.random()*100) + 1) ;
			
			int res = 0;
			if(rn1%2 == 0) {
				System.out.printf("%d + %d = ???" , rn1 , rn2);
				res = rn1 + rn2;
			} else { 
				System.out.printf("%d - %d = ???" , rn1 , rn2);
				res = rn1 - rn2;
			}
			
			//--
			System.out.print("\n> ");
			
			input = sc.nextInt();
			if(input == res) {
				System.out.println("정답입니다.!!");
				ok ++;
			} else if(input == 0) {
				System.out.println("종료합니다.!!");
				break;
			} else {
				System.out.println("틀렸습니다.!!");
				err ++;
			}
		}
		System.out.println("---------------------");
		System.out.println("정답 횟수 :" + ok + "회");
		System.out.println("오답 횟수 :" + err + "회");
		System.out.println("---------------------");
		
		sc.close();
	}

}
