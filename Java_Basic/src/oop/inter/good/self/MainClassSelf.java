package oop.inter.good.self;

import java.util.Scanner;

public class MainClassSelf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("진행할 번호를 입력하세요");
		System.out.println("1.가입 2.로그인 3.정보수정 4.탈퇴 : ");
		System.out.print(">");
		int menu = sc.nextInt();
		
		IUserServiceSelf sv;
		
		if(menu == 1) {
			sv = new JoinSelf();
			sv.executeSelf();
			
		} else if(menu == 2) {
			sv = new LoginSelf();
			sv.executeSelf();			
		} else if(menu == 3) {
			sv = new UpdateSelf();
			sv.executeSelf();
		} else if(menu == 4) {
			sv = new DeleteSelf();
			sv.executeSelf();
		}
		sc.close();
	}

}
