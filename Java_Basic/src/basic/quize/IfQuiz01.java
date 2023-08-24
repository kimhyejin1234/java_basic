package basic.quize;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {

		 /*
		         - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		         혹은 같은지를 판별하시면 됩니다.
		         ex)
		         입력받은 수: 4, 7 -> 7이 큰 수 입니다.
		         입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		         입력받은 수: 5, 5 -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 1을 입력하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수를 2을 입력하세요 : ");
		int input2 = sc.nextInt();
		 
		if(input1 > input2) {	
			System.out.printf("입력받은 수 : %d , %d -> %d 이 큰수 입니다.",input1 , input2 , input1);
		} else if(input1 < input2) {	
			System.out.printf("입력받은 수 : %d , %d -> %d 이 큰수 입니다.",input1 , input2 , input2);
		} else {
			System.out.printf("입력받은 수 : %d , %d -> 같은 수 입니다.",input1 , input2 );
		}
		sc.close();
	}

}
