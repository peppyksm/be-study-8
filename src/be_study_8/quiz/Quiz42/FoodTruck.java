package be_study_8.quiz.Quiz42;

import java.util.Scanner;

public class FoodTruck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totalSales = 0;
		int totalDamage = 0;

		Food f1 = new Food("김밥", 4000);
		Food f2 = new Food("떡볶이", 6000);
		Food f3 = new Food("순대", 7000);

		Food[] menu = { f1, f2, f3 };

		f1.setCount(5);
		f2.setCount(4);
		f3.setCount(6);

		ShowMenu.menu(menu);

		while (true) {

			int inputNum = 0;
			int num = MenuSelect.menuSelect();

			if (num == 1) {
				ShowMenu.menu(menu);
			} else if (num == 2) {
				System.out.print("주문 할 메뉴번호 : ");
				inputNum = scanner.nextInt();
				if(inputNum < 1 || inputNum > 4) {
					System.out.println("잘못 입력했습니다.");
				}else {
					menu[inputNum - 1].order();
				}
			} else if (num == 3) {
				System.out.print("관리 할 메뉴번호 : ");
				inputNum = scanner.nextInt();
				if(inputNum < 1 || inputNum > 4) {
					System.out.println("잘못 입력했습니다.");
				}else {
					menu[inputNum - 1].add();
				}
			} else if (num == 4) {
				for (int i = 0; i < menu.length; i++) {
					totalSales += menu[i].sales;
					menu[i].deadLine();
					totalDamage += menu[i].damage;
				}
				int index = totalSales - totalDamage;
				System.out.println("=====[영업마감] =====");
				System.out.println("----[마감정보] ----");
				System.out.println(">>> 총매출액 : " + totalSales);
				System.out.println(">>> 원가차감 : " + totalDamage);
				System.out.println(">>> 최종수익 : " + index);
				
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}

		}

	}

}

class Food {
	Scanner scanner = new Scanner(System.in);
	String name;
	int price;
	int count;
	int temp;
	int sales;
	int damage;
	int revenue;

	Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}

	void order() {
		System.out.print("수량 입력 : ");

		while (true) {
			temp = scanner.nextInt();
			if (count < temp) {
				System.out.println(count + "개 이상 주문할 수 없습니다. 다시 입력해주세요.");
			} else {
				count -= temp;
				sales += temp * price;
				break;
			}
		}

	}

	void add() {
		System.out.print("수량 입력 : ");
		count += scanner.nextInt();
	}

	int deadLine() {
		damage += count * (price * 0.3);

		return damage;
	}

}

class ShowMenu {
	static void menu(Food[] menu) {

		System.out.println("-------[메뉴]-------");
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("[%d] %s : %d원 (잔여재고:%d)\n", (i + 1), menu[i].name, menu[i].price, menu[i].count);
		}
	}
}

class MenuSelect {

	static int menuSelect() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***[메뉴선택]***");
		System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
		System.out.print(">>> 입력 : ");
		int inputNum = scanner.nextInt();
		return inputNum;
	}
}
