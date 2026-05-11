package be_study_8.quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		
		//1번
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~24 중 하나의 정수를 입력해주세요 : ");
		int time = scanner.nextInt();
		
		if(1 <= time && time <=12 ) {
			System.out.println("오전입니다.");
			if(time<6) {
				System.out.println("이른 오전입니다.");
			}else{
				System.out.println("늦은 오전입니다.");
			}
		}else if(24 >= time && time >12) {
			System.out.println("오후입니다.");
			if(time<18) {
				System.out.println("이른 오후입니다.");
			}else {
				System.out.println("늦은 오후입니다.");
			}
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		//2번
		
		int diceNum = 3;
		
		if(diceNum == 1) {
			System.out.println("1");
		}else if(diceNum == 2) {
			System.out.println("2");
		}else if(3 <= diceNum && diceNum <= 5) {
			if(diceNum == 3) {
				System.out.println("3");
				System.out.println("4");
				System.out.println("5");
			}else if(diceNum == 4) {
				System.out.println("4");
				System.out.println("5");
			}else {
				System.out.println("5");
			}
		}else {
			System.out.println("6");
		}
		
		
		//3번
		
		String localNum = "031";
		
		switch(localNum) {
		case "031": 
			System.out.println("경기도입니다.");
			break;
		case "02": 
			System.out.println("서울입니다.");
			break;
		case "041": 
			System.out.println("충남입니다.");
			break;
		case "051": 
			System.out.println("부산입니다.");
			break;
		}
		
		
		
		//4번
		
		int score = 100;
		int score2 = score / 10;
		
		switch(score2) {
		case 10:
			System.out.println("학점A");
			break;
		case 9:
			System.out.println("학점A");
			break;
		case 8:
			System.out.println("학점B");
			break;
		case 7:
			System.out.println("학점C");
			break;
		default:
			System.out.println("학점F");
			break;
		}
	}
}
