package oop.encap.good;

public class MyBirth2 {
	
	
	private int year;
	private int month;
	private  int day;
	
	public void setYear(int year) {
		if(year >= 1900 && year <= 2023 ) {
			this.year = year;
		}
	}
	
	
	public void setMonth(int month) {
		if(month >= 1 && month <= 12 ) {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		if(isValidateMonth(day)) {
			this.day = day;
		}		
	}
	
	//완성된 생일 정보를 출력해 주는 메서드
	public void birthInfo() {
		// year,month,day 셋중 단 하나라도 제대로 값이 셋팅되지 않았다면
		//출력을 해주지 않겠다.
		
		if(this.year == 0) { 
			System.out.printf("년도 오류 입니다.\n");
			return;
		}
		if(this.month == 0) {
			System.out.printf("월 오류 입니다.\n");
			return;
		}
		if(this.day == 0){
			System.out.printf("일 오류 입니다.\n");
			return;
		}
		
		System.out.printf("내 생일은 %d 년 %d 월 %d 일 입니다.\n",this.year,this.month,this.day);
		
	}
	
	private boolean isValidateMonth(int day) {
		//각 월에 적합한 일자가 세팅이 되어 있는지를 판별하는 메서드
//		boolean flag = true;
		switch (this.month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day<1 || day> 31) {
				return false;
			}
			break;
		case 2: 
			if(day<1 || day> 28) {
				return false;
			}
			break;

		default:
			if(day<1 || day> 30) {
				return false;
			}
		}
		return true;
	}
}
