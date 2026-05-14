package be_study_8.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		//1번
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("자연수 5개를 입력하세요");
		int[] arr1 = new int[5];

		for(int i = 1; i<=5; i++) {
			System.out.print(i+"번째 수 입력 : ");
			arr1[i-1] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? : ");
		int select = scanner.nextInt();
		System.out.println("결과 : " + arr1[select-1]);
		
		
		//2번
		System.out.println("자연수 5개를 입력하세요");
		int[] arr2 = new int[5];
		
		for(int i = 1; i<=5; i++) {
			System.out.print(i+"번째 수 입력 : ");
			arr2[i-1] = scanner.nextInt();
		}
		
		for(int i = 4; i>=0; i--) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		
		//3번
		int[][] arr3 = new int[4][4];

		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 3; j++) {
				arr3[i][j] = i * 4 + j + 1;
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
