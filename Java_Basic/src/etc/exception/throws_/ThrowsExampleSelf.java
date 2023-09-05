package etc.exception.throws_;

public class ThrowsExampleSelf {
	
	static String[] greetings = {"여기는","아무거나","다","할수있어"};
	
	static void greet (int indx) throws Exception {
		System.out.println(greetings[indx]);
	}
	public static void main(String[] args) {
		
		try {
			greet(4);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("아무튼 생성");
		}
		System.out.println("프로그램이 정상 종료 되었습니다.");
		
	}

}
