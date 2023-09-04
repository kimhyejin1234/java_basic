package oop.inter.good;

public  class Login implements IUserService {

	@Override
	public void execute() {
		System.out.println("로그인 요청이 들어옴!");
		System.out.println("사용자가 입력한 id , pw 를 받고, 데이터도 받습니다.!");
	}
	
	
}
