package be_study_8.quiz.Quiz42;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {

	Scanner scanner = new Scanner(System.in);

	Food[] menu = new Food[3];
	int menuCount = 0;
	int sales = 0;
	int damage = 0;
	int revenue = 0;
	

	void run() {
		showMenu();
		setStock();
		while(true) {
			
			int inputNum = menuSelect();
			if(inputNum == 1) {
				showMenu();
			}else if(inputNum == 2) {
				order();
			}else if(inputNum == 3) {
				addStock();
			}else if(inputNum == 4) {
				closing();
				break;
			}else 
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	
	
	void addMenu(Food food) {
		this.menu[menuCount] = food;
		menuCount++;
	}
	
	
	void setStock() {
		int inputNum = 0;
		System.out.println("===초기 재고 세팅(해당 메뉴를 종료하려면 0번을 입력하세요)===");
		while(true) {
			System.out.print("재고 세팅할 음식 번호를 입력하세요 : ");
			inputNum = scanner.nextInt();
			if(inputNum == 0) {
				System.out.println("종료");
				break;
			}
			
			if(inputNum >= menu.length + 1 || inputNum < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}else {
				System.out.printf("%s의 초기 재고를 입력하세요 : ",menu[inputNum-1].name);
				menu[inputNum-1].stock = scanner.nextInt();
			}
		}
	}

	void showMenu() {
		System.out.println("-------[메뉴]-------");
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("[%d] %s : %d원 (잔여재고:%d)\n", (i + 1), menu[i].name, menu[i].price, menu[i].stock);
		}
	}
	
	int menuSelect() {
		System.out.println("***[메뉴선택]***");
		System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
		System.out.print(">>> 입력 : ");
		return scanner.nextInt();
	}
	
	void order() {
		
		int menuNum = 0;
		int orderNum = 0;
		
		while (true) {
			System.out.print("주문 할 메뉴번호 : ");
			menuNum = scanner.nextInt();
			if(menuNum >= 4 || menuNum < 1){
				System.out.println("메뉴 번호를 잘못 입력했습니다. 다시 입력해주세요.");
				break;
			}
			
			if(menu[menuNum-1].stock == 0) {
				System.out.printf("현재 %s은(는) 품절되었습니다.\n", menu[menuNum-1].name);
				break;
			}
			System.out.print("수량 입력 : ");
			orderNum = scanner.nextInt();
			
			if (menu[menuNum-1].stock < orderNum) {
				System.out.println(menu[menuNum-1].stock + "개 이상 주문할 수 없습니다. 다시 입력해주세요.");
				break;
			}else {
				menu[menuNum-1].stock -= orderNum;
				sales += orderNum * menu[menuNum-1].price;
				break;
			}
		}
	}
	
	void addStock() {
		System.out.print("추가 할 메뉴번호 : ");
		int menuNum = scanner.nextInt();
		System.out.print("수량 입력 : ");
		int orderNum = scanner.nextInt();
		menu[menuNum-1].stock += orderNum;
	}
	
	void closing() {
		for(int i = 0; i < menu.length; i++) {
			damage += menu[i].stock * menu[i].price * 0.3;
		}
		revenue = sales - damage;
		
		System.out.println("=====[영업마감] =====");
		System.out.println("----[마감정보] ----");
		System.out.println(">>> 총매출액 : " + sales);
		System.out.println(">>> 원가차감 : " + damage);
		System.out.println(">>> 최종수익 : " + revenue);
		
		
	}
}
