package oop.obj_arr;

public class ScoreTeacher {
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
   */
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public ScoreTeacher() {	}

	public ScoreTeacher(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total / 3.0;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getKor() {
		return kor;
	}

	public final void setKor(int kor) {
		this.kor = kor;
	}

	public final int getEng() {
		return eng;
	}

	public final void setEng(int eng) {
		this.eng = eng;
	}

	public final int getMath() {
		return math;
	}

	public final void setMath(int math) {
		this.math = math;
	}

	public final int getTotal() {
		return total;
	}

	public final void setTotal(int total) {
		this.total = total;
	}

	public final double getAverage() {
		return average;
	}

	public final void setAverage(double average) {
		this.average = average;
	}

	public void scoreInfo() {
		System.out.println("------------------");
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.1f \n" ,average);

	}
	
	
	
}
