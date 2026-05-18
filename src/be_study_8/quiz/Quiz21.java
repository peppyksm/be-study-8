package be_study_8.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		//1번
		int count1 = 0;
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<= 6; j++) {
				if(i+j==6) {
					System.out.println(i + "+" + j + "=" + (i+j));
					count1 += 1;
				}
			}
		}
		System.out.println("경우의 수 : " + count1);
		System.out.println();
		
		
		//2번
		int[] lotto = new int[6];

		
		for(int i = 0; i < lotto.length; i++) {
		    lotto[i] = (int)((Math.random() * 45) + 1);

		    
		    for(int j = 0; j < i; j++) {
		        if(lotto[i] == lotto[j]) {
		            i--;
		            continue;
		        }
		    }
		}

		for(int i = 0; i < lotto.length; i++) {
		    System.out.println(lotto[i]);
		}
		
		System.out.println();
		
		//4번
		
		int[][] arr =
			{
			{10, 20, 30},
			{20, 30, 40},
			{30, 40, 50}
			};
		
		int[][] arr2 = new int [4][4];
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				arr2[i][j] = arr[i][j];
			}
		}
		
		for(int i = 0; i<4; i++) {
			arr2[i][3] = arr2[i][0] + arr2[i][1] + arr2[i][2];
			arr2[3][i] = arr2[i][3];
		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		/* 3번
		Scanner scanner = new Scanner(System.in);
		
		int score [][] = new int[3][5];
		int total[] = new int[3];
		int avg[] = new int[3];
		double totalAvg = 0;
		
		System.out.println("===1반 점수 입력===");
		for(int i = 0; i<5; i++) {
			System.out.printf("%d번 점수 입력 : ",(i+1));
			score[0][i] = scanner.nextInt();
		}
		
		System.out.println("===2반 점수 입력===");
		for(int i = 0; i<5; i++) {
			System.out.printf("%d번 점수 입력 : ",(i+1));
			score[1][i] = scanner.nextInt();
		}
		
		System.out.println("===3반 점수 입력===");
		for(int i = 0; i<5; i++) {
			System.out.printf("%d번 점수 입력 : ",(i+1));
			score[2][i] = scanner.nextInt();
		}
		
		System.out.printf("1반 :");
		for(int i = 0; i<5; i++) {
			System.out.print(score[0][i]+" ");
		}
		System.out.println();
		
		System.out.printf("2반 :");
		for(int i = 0; i<5; i++) {
			System.out.print(score[1][i]+" ");
		}
		System.out.println();
		
		System.out.printf("3반 :");
		for(int i = 0; i<5; i++) {
			System.out.print(score[2][i]+" ");
		}
		System.out.println();
		
		
		for(int i = 0; i<5; i++) {
			total[0] += score[0][i];
		}
		
		for(int i = 0; i<5; i++) {
			total[1] += score[1][i];
		}
		for(int i = 0; i<5; i++) {
			total[2] += score[2][i];
		}
		
		for(int i = 0; i<3; i++) {
			avg[i] = total[i] / 5;
		}
		
		for(int i = 0; i<3; i++) {
			System.out.printf("%d반 평균 : %d",(i+1), avg[i]);
			System.out.println();
		}
		
		for(int i = 0; i<3; i++) {
			totalAvg += avg[i];
		}
		totalAvg /= 3.0;
		System.out.println("전체 평균 : "+ totalAvg);
	    */
	}

}
