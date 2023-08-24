package basic.quize;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		/*
		         - 정수 3개를 입력 받습니다.
		         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
		         
		         # max, mid, min이라는 변수를 미리 선언하셔서
		          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		          마지막에 한번에 출력하시면 되겠습니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 1을 입력하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수를 2을 입력하세요 : ");
		int input2 = sc.nextInt();
		
		System.out.print("정수를 3을 입력하세요 : ");
		int input3 = sc.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		int err = 0;
		
		if(input1 == input2 ) {
			System.out.println("정수1 과 정수2 가 같습니다. 다른값을 입력하세요. ");
			err = 1;
		} else if (input1 == input3) {
			System.out.println("정수1 과 정수3 이 같습니다. 다른값을 입력하세요. ");
			err = 1;
		} else if (input2 == input3) {
			System.out.println("정수2 과 정수3 이 같습니다. 다른값을 입력하세요. ");
			err = 1;
		}
		
		if(err == 0 ) {
			if(input1 > input2) {
				if(input1 > input3) {
					max = input1 ;
					mid = input2 ;
					min = input3 ;
					if(input2 < input3) {
						mid = input3;
						min = input2;
					} 
				} else {
					max = input3;
					mid = input1;
					min = input2;
				}
			} else {
				if(input2 > input3) {
					max = input2 ;
					mid = input3 ;
					min = input1 ;
					if(input3 < input1) {
						mid = input1;
						min = input3;
					}
				} else {
					max = input3;
					mid = input2;
					min = input1;
				}
			}
			System.out.println("가장 큰 값 : " + max);
			System.out.println("중간   값 : " + mid);
			System.out.println("가장 작은 값 : " + min);
		}
		sc.close();
		
	}

}
