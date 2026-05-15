package be_study_8.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		
		//1번
		
		int[][] arr1 = new int[4][4];
		for(int i = 0; i <=3; i++) {
			for(int j = 0; j <=3; j++) {
				arr1[i][j] = j + i*4 + 1;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2번
		int[][] arr2 = new int[5][5];
		arr2[0][0] = 1;
		arr2[1][0] = 2;
		arr2[2][0] = 3;
		arr2[3][0] = 4;
		
		for(int i = 0; i<=3; i++) {
			for(int j = 1; j<=4; j++) {
				arr2[i][j] = arr2[i][j-1] + 4; 
				System.out.print(arr2[i][j-1] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//3번
		int[][] arr3 = new int[4][4];
		
		for(int i = 0; i <=3; i++) {
			for(int j = 0; j<=3; j++) {
				arr3[i][j] = 16-j-(i*4);
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//4번
		int[][] arr4 = new int[5][5];
		
		arr4[0][0] = 16;
		arr4[1][0] = 15;
		arr4[2][0] = 14;
		arr4[3][0] = 13;
		
		
		for(int i = 0; i<=3; i++) {
			for(int j = 0; j<= 3; j++) {
				arr4[i][j+1] = arr4[i][j] - 4;
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}