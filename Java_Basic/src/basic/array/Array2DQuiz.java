package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {
		int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
		/*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
        int idx = 0;
        int[] gsum = new int[3];
        int totsum = 0;
        
        System.out.println("= 학생별 평균 ========================");
        for(int[] array:score) {
        	int sum  = 0;
        	int j = 0;
			for(int n : array) {
				sum += n;
				gsum[j] += n;
				j ++;
				
			}
			System.out.printf("%s 학생의 평균 : %.1f 점\n",stuName[idx] ,(double)sum/subName.length);
			totsum += sum;
			idx++;
        }

        //각 과목별 평균
        System.out.println("= 과목별 평균 ========================");
        for(int i = 0 ; i<gsum.length;i++) {
        	System.out.printf("%s 과목의 평균 : %.1f 점\n",subName[i] ,(double)gsum[i]/stuName.length);
        }
        
        //반 평균
        System.out.println("= 반 평균 ===========================");
        System.out.printf("= %.1f 점\n",(double)totsum/(stuName.length*subName.length));
        
        // 각 과목별 선생님 해석
        System.out.println("= 과목별 평균 선생님 해석=================");
        for(int i=0;i<subName.length;i++) {
        	int total = 0;
        	for(int j=0 ; j<stuName.length ; j++ ) {
        		total += score[j][i];
        	}
        	System.out.printf("%s 과목의 평균 : %.1f 점\n",subName[i] ,(double)total/stuName.length);
        }
        
        

        
	}
    

}
