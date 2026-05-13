package be_study_8.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//=================1번===================
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("even");
		}else if(num % 2 == 0){
			System.out.println("odd");
		}else if(num == 0) {}
		
		
		
		//=================2번===================
		if(num % 7 == 0) {
			System.out.println("7의 배수입니다");
		}else {
			System.out.println("아닙니다");
		}
		
		
		//=================3번===================
		int sum = 0;
		
		for(int i = 0; i<=1000; i++) {
			if(i % 5 ==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		//=================4번===================
		System.out.print("1~50까지의 수를 입력하세요 : ");
		int num2 = scanner.nextInt();
		
		if(num2 < 1 || 51 < num2) {
			System.out.println("잘못된 입력입니다");
		}else {
			for(int i = 1; i <= num2; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
		//=================5번===================
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				sum2 += i;
			}else {
				sum2 -= i;
			}
		}
		System.out.println(sum2);
		
		
		
		//=================6번===================
		int num3 = 1;
		int sum3 = 0;
		
		while(sum3 <= 1000) {
			sum3 += num3++;
			}
		System.out.println(sum3);
		
		
		//=================7번===================
		System.out.print("1부터 9까지의 수를 입력하세요 : ");
		int num4 = scanner.nextInt();
		
		if(num4 < 1 || num4 > 9) {
			System.out.println("잘못된 입력입니다.");
		}else {
			for(int i = 1; i <= 9; i++) {
				System.out.println(num4 + "*" + i + "=" + num4*i);
			}
		}
	}
}
