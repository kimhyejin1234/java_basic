package basic.operator;

public class PlusMinusExample1 {

	public static void main(String[] args) {
		
		
		//증감 연산자 (++ , --)
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.
		
		int i = 1;
		int j = i ++; //후위 연산(선연산 후증감)
		int k = i --;
		System.out.println("i 의 값 : " +i);
		System.out.println("j 의 값 : " +j);
		System.out.println("k 의 값 : " +k);

		System.out.println("------------------------");
		
		
		i = 1;
		j = ++i;//전위 연산(선증감 후연산)
		k = --i;
		System.out.println("i 의 값 : " +i);
		System.out.println("j 의 값 : " +j);
		System.out.println("k 의 값 : " +k);
		
		System.out.println("------------------------");
		int a = 3;
		int b = ++a + 5 * 3;
		System.out.println(b);// 19
		System.out.println(a);// 4
	
	}
}
