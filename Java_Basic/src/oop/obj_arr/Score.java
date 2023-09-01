package oop.obj_arr;

public class Score {
	

	/*
	     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
	      담을 수 있는 객체를 디자인하세요.
	      
	     - 학생의 모든 정보를 한 눈에 확인할 수 있게
	      scoreInfo() 메서드를 선언해 주세요.
	      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
	      
	     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	    */
	
	String name;
	int kor = 0;
	int eng = 0;
	int mat = 0;
	
	public Score() {}
	
	public Score(String name, int kor , int eng , int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	

	public void scoreInfo() {
		System.out.println("------------------");
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + (kor+eng+mat));
		System.out.printf("평균 : %.1f \n" ,(double) (kor+eng+mat)/3);
	}


	
}
