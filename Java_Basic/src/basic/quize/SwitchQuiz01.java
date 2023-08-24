package basic.quize;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		/*
		         - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		          다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		          연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		          연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		          결과를 말씀해 주세요.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 1을 입력하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.print("연산자 하나를 입력하세요 : ");
		String input2 = sc.next();
		
		System.out.print("정수를 2을 입력하세요 : ");
		int input3 = sc.nextInt();
		
		int err = 0;
		double result = 0.0;
		switch (input2) {
		case "*":
			result = input1 * input3;
			break;
		case "/":
			if(input3 == 0) {
				System.out.println("연산자 / 입력시 정수2는 zero 입력 불가 입니다.");
				err = 1;
			} else {
				result = (double) input1 / input3;
			}
			break;
		case "+":
			result = input1 + input3;
			break;
		case "-":
			result = input1 - input3;
			break;
		default:
			err = 1;
			System.out.println("연산자는 + , - , * , / 만 입력 가능합니다.");
		}
		
		if(err == 0) {
			System.out.println( "연산 결과 : " + input1 + input2 + input3 + "=" + result );
		}
		
		sc.close();
		
		

		
		
	}

}
