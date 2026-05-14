package be_study_8.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] menu = {"입력","수정","조회","삭제","종료"};
		
		
		
		int num = 0;
		
		while(num != 5) {
			for(int i = 1; i <=5; i++) {
				System.out.println(i + "." + menu[i-1]);
			}
			System.out.print("메뉴 번호를 입력하세요 : ");
			num = scanner.nextInt();
			if(0 < num && num < 5) {
				System.out.println(menu[num-1] + " 메뉴입니다.");
				System.out.println("=======================");
			}else if(num == 5) {
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("잘못 입력하셨습니다");
				System.out.println("=======================");
			}
			
		}
		

	}

}
