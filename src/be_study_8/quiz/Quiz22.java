package be_study_8.quiz;

public class Quiz22 {

	public static void main(String[] args) {
		
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		int min = scores[0];
		int max = scores[0];
		int total = 0;
		int over_80 = 0;
		
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] < min) {
		        min = scores[i];
		    }

		    if(scores[i] > max) {
		        max = scores[i];
		    }

			
			
			
			
			total += scores[i];
			if(scores[i] >= 80) {
				over_80 += 1;
			}
		}
		
		System.out.println("최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
		System.out.println("평균 점수 : "+ ((double)total/scores.length));
		System.out.println("80점 이상인 학생 수 : "+over_80+"명");
	}

}
