package etc.generic.basic2;

public class MainClassSelf {

	public static void main(String[] args) {

		BoxSelf<Integer,String> bx = new BoxSelf<>(1,"aaa");
		System.out.println(bx.get(1));
		
		bx.set(10,"bbb");
		System.out.println(bx);
		
		
		
	}

}
