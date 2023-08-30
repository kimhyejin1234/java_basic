package oop.encap.good;

public class Main {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 123;
		my.setYear(1992);
		my.setMonth(12);
		my.setDay(19);
		System.out.printf("내 생일은 %d 년 %d 년 %d 일 입니다.\n",my.getYear(),my.getMonth(),my.getDay());
		
		
		
	}

}
