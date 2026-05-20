package be_study_8.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총 몇명이 탑승 합니까? : ");
		int people = scanner.nextInt();
		
		System.out.print("멈출 수 있는 최대 횟수 입력 : ");
		int max = scanner.nextInt();
		
		int[] floors = new int[people];
		System.out.printf("인원 수 만큼 내릴 층을 입력하세요 : ");
		
		System.out.println();
		for(int i = 0; i < floors.length; i++) {

		    while(true) {

		        System.out.print((i + 1) + "번째 층 입력 : ");
		        int input = scanner.nextInt();

		        boolean isDuplicate = false;

		        for(int j = 0; j < i; j++) {
		            if(floors[j] == input) {
		                isDuplicate = true;
		                break;
		            }
		        }

		        if(isDuplicate) {
		            System.out.println(input + "층은 중복입니다. 다시 입력해주세요.");
		        } else {
		            floors[i] = input;
		            break;
		        }
		    }
		}
		
		int lostpeople = floors.length;
		
		for(int i = 0; i < 100; i++) {
			System.out.println("현재 " + (i+1) + "층 입니다.");
			for(int j = 0; j < floors.length; j++) {
				if(floors[j] == i) {
					System.out.println(i + "층에서 내립니다.");
					lostpeople--;
					max--;
				}
			}
			if(lostpeople == 0) {
				System.out.println("모든 인원이 내렸습니다. 1층으로 내려갑니다.");
				i = 1;
				System.out.println(i + "층 입니다."); 
				break;
			}
			if(max == 0) {
				System.out.println("최대 운행 횟수에 도달했습니다. 계단을 이용해주세요.");
				lostpeople = 0;
				System.out.println(i + "층 현재 점검중.");
				break;
			}
		}
	}

}
