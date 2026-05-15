package be_study_8.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		//1번
		int[] arr1 = {2,4};
		
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				if((arr1[0]*i) + (arr1[1]*j) == 10) {
					System.out.printf("x : %d, y : %d\n",i,j);
				}
			}
		}
		//2번
		int[] arr2 = new int[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		for(int i = 1; i<=2; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			arr2[i-1] = scanner.nextInt();
		}
		if(arr2[0] > arr2[1]) {
			System.out.printf("큰수 : %d 작은 수 : %d\n",arr2[0], arr2[1]);
		}else if(arr2[1] > arr2[0]) {
			System.out.printf("큰수 : %d 작은 수 : %d\n",arr2[1], arr2[0]);
		}else {
			System.out.println("같은 수 입니다.");
		}
		
		//3번
		System.out.println("4개의 윷을 입력하세요(1:뒤집어짐 0:안뒤집어짐) ex)0 0 1 0 : ");
		int[] arr3 = new int[4];
		
		for(int i = 0; i<=3; i++) {
			arr3[i] = scanner.nextInt();
		}
		if(arr3[0]+ arr3[1]+ arr3[2]+ arr3[3] == 4) {
			System.out.println("결과 : 윷");
		}else if((arr3[0]+ arr3[1]+ arr3[2]+ arr3[3] == 1)) {
			System.out.println("결과 : 도");
		}
		else if((arr3[0]+ arr3[1]+ arr3[2]+ arr3[3] == 2)) {
			System.out.println("결과 : 개");
		}
		else if((arr3[0]+ arr3[1]+ arr3[2]+ arr3[3] == 3)) {
			System.out.println("결과 : 걸");
		}else {
			System.out.println("결과 : 모");
		}
		
		//4번
		System.out.println("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		for(int i = 0; i<num; i++) {
			System.out.print("*");
		}
	}

}
