package be_study_8.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[5][5];

		for(int i = 0; i<=4; i++) {
			
			for(int j = 0; j<=4; j++) {
				
				if(i == j) {
					arr[i][j] = 1;
				}
				else if(i<j) {
					arr[i][j] = 2;
				}
				else {
					arr[i][j] = 3;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}