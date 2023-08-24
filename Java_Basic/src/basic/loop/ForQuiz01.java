package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19까지의 난수를 생성 하셔서 구구단을 출력하자.
		//19행 까지 출력하세요.	
		int rn = (int) ((Math.random()*18) + 2) ;
		
		System.out.println( "===== " + rn + " 의 구구단을 계산 ===== ");
		for(int i=1 ; i<=19 ; i++) {
			System.out.println(rn + " x " + i + " = " + rn*i);
		}
	}

}
