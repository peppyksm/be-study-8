package be_study_8.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = {3500, 4100, 4300};
		int[] countArr = new int[3];

		while(true) {

		    int menu;
		    int count;
		    String addOrder;

		    System.out.println("======메뉴======");

		    for(int i = 0; i < menuArr.length; i++) {
		        System.out.printf("%d. %s %7d원\n",
		                (i+1), menuArr[i], priceArr[i]);
		    }

		    System.out.println("===============");

		    while(true) {
		        System.out.print("메뉴 선택 : ");
		        menu = scanner.nextInt();

		        if(menu >= 1 && menu <= menuArr.length) {
		            break;
		        } else {
		            System.out.println("잘못입력했습니다.");
		        }
		    }

		    System.out.print("수량 입력 : ");
		    count = scanner.nextInt();

		    countArr[menu-1] += count;

		    scanner.nextLine(); // 엔터 제거

		    while(true) {

		        System.out.print("추가주문 하시겠습니까?(y/n) : ");
		        addOrder = scanner.nextLine();

		        if(addOrder.equals("y") || addOrder.equals("n")) {
		            break;
		        } else {
		            System.out.println("잘못입력했습니다.");
		        }
		    }

		    if(addOrder.equals("n")) {

		        System.out.println("====================");

		        int total = 0;

		        for(int i = 0; i < menuArr.length; i++) {

		            if(countArr[i] > 0) {

		                System.out.printf("%s %d잔 : %d원\n",
		                        menuArr[i],
		                        countArr[i],
		                        countArr[i] * priceArr[i]);

		                total += countArr[i] * priceArr[i];
		            }
		        }

		        System.out.println("====================");
		        System.out.println("총액 : " + total);

		        break;
		    }
		}
		
		/*
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		
		int menu;  //메뉴 선택 입력
		int count; //수량 입력
		String addOrder; //추가주문여부 입력받는 용도
		
		
		while(true) {
			System.out.println("======메뉴======");
			System.out.println("1. 아메리카노   3500원");
			System.out.println("2. 카페라떼   4100원");
			System.out.println("3. 바닐라라떼   4300원");
			System.out.println("===============");
			
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			
			if(menu >= 1 && menu <= 3) {
				
				System.out.print("수량 입력 : ");
				count = scanner.nextInt();
				
				if(menu == 1) {
					menu1Count += count;
				}else if(menu == 2) {
					menu2Count += count;
				}else {
					menu3Count += count;
				}
				
				
				
				while(true) {
					System.out.print("추가 주문 하시겠습니까?(y/n)");
					addOrder = scanner.nextLine();
					
					if(addOrder.equals("y")||addOrder.equals("n")) {
						break;
					}else{
						System.out.println("잘못입력했습니다. 추가주문여부(y/n) 다시 선택해주세요.");
						continue;
					}
				}
				
				if(addOrder.equals("n")) {
					
					System.out.println("====================");
					if(menu1Count > 0) {
						System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					}
					if(menu2Count > 0) {
						System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					}
					if(menu3Count > 0) {
						System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
					}
					
					int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("====================");
					System.out.println("총액 : " + total + "원");
					
					break;
				}else {
					
				}
				
			}else {
				System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
				continue;
			}
		}
		*/
		
		
	}
}