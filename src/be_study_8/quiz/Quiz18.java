package be_study_8.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {

		//1번
		for(int i = 1; i<=5; i++) {
			for(int j = 0; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2번
		for(int i = 3; i>=0; i--) {
			for(int j = 1; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3번
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num3 = scanner.nextInt();
		
		for(int i = 1; i<=num3; i++) {
			if(num3 % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		

		
		
		
		//4번
		System.out.print("정수를 입력하세요 : ");
		int num4 = scanner.nextInt();
		
		for(int i = num4; i>=0; i--) {
			for(int j = 1; j<=num4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i<=num4; i++) {
			for(int j = 0; j<=num4-i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		//5번
		int[] arr5 = new int [10];
		arr5[0] = 1;
		
		for(int i = 1; i<=9; i++) {
			arr5[i] = arr5[i-1] + i + 1;
			System.out.println(arr5[i]);
		}
		int num5 = 0;
		
		for(int i = 0; i <=9; i++) {
			num5 += arr5[i];
		}
		System.out.println("결과 : "+num5);
	
		
		//6번
		int num6 = 0;
		
		for(int i = 1;; i++) {
			if(i % 2 == 0) {
				num6 -= i;
			}else {
				num6 += i;
			}
			
			if(num6 >= 100) {
				System.out.println("누적합 : "+num6);
				System.out.println("마지막 더한 수 : "+i);
				break;
			}
		}
			
	}	
}