package basic.loop;



public class WhileExample2 {

	public static void main(String[] args) {
		//48~150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		int n = 48;
		while (n <= 150) {
			if(n%8 == 0) {
				System.out.print(n + " ");
			}
			n ++;	
		}
		
		System.out.println(); //단순 줄 개행
		
		//1~100 까지의 정수 중 4의 배수이면서 
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		n = 1;
		while (n <= 100) {
			if(n % 4 == 0 ) {
				if(n % 8 != 0) {
					System.out.print(n + " ");
				}
			}
			n ++;
		}
		System.out.println(); //단순 줄 개행
		
		
		//1~30000 까지의 정수 중 258의 배수의 개수를 출력
		n = 1;
		int total = 0;
		while(n <= 30000) {
			if(n % 258 == 0) {
				total ++;
			}
			n ++;
		}
		System.out.printf("1~30000 까지의 정수 중 258의 배수의 개수는 %d 입니다.",total);
		System.out.println(); //단순 줄 개행
		
		//1000의 약수의 개수를 구하세요.
		n = 1;
		total = 0;
		while(n<=1000){
			if(1000 % n == 0) {
				total ++;
			}
			n ++;
		}
		System.out.printf("1000의 약수의 개수 %d 입니다.",total);
		System.out.println(); //단순 줄 개행
	}

}
