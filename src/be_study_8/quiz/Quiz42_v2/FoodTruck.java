package be_study_8.quiz.Quiz42_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {

	List<Food> foodList = new ArrayList<>();
	String truckName;
	int totalSales;
	boolean isOpened;

	FoodTruck() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	void addFood(Food food) {
		foodList.add(food);
	}

	void addFood(String name, int price, int stock) {
		Food food = new Food(name, price, stock);
		foodList.add(food);
	}

	public void startSales() {
		// 처리 로직
		isOpened = true;
		System.out.println("=======[" + truckName + " 푸드트럭 영업 시작]========");
		Scanner scanner = new Scanner(System.in);

		while (isOpened) {

			// 메뉴 보여주기
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");

			// 메뉴 선택
			int menuInput = scanner.nextInt();

			switch (menuInput) {
			case 1: // 메뉴보기
				showFoodList();
				break;
				
			case 2: // 주문하기
				orderMenu();
				break;
				
			case 3: // 재고관리
				manageStock();
				break;
				
			case 4: // 마감하기
				finishSales();
				break;
				

			default:
				System.out.println("메뉴를 잘못입력하셨습니다.");
			}

			// 선택 메뉴에 따라 기능 수행

		}

	}

	int getMainMenu() {
		// 메뉴 보여주기

		Scanner scanner = new Scanner(System.in);

		int menuInput;

		while (true) {
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");

			// 메뉴 선택
			menuInput = scanner.nextInt();

			if (menuInput >= 1 && menuInput <= 4) {
				break;
			} else {
				System.out.println(">>>잘못 입력했습니다.");
				System.out.println(">>>메뉴 1~4 보기중에 선택하세요.");
			}
		}
		return menuInput;

	}

	void showFoodList() {
		for (int i = 0; i < foodList.size(); i++) {

			Food f = foodList.get(i);
			System.out.printf("%d. %s\n", (i + 1), f.getFoodInfo());
		}
	}

	void orderMenu() {
		int orderMenuIndex = getFoodMenuIndex();
		showFoodList();

		int orderCount = 1;
		
		Food orderFood = foodList.get(orderMenuIndex);
		
		if (orderFood.stock >= orderCount) {

			orderFood.modifyStock(-orderCount);
			totalSales += orderFood.price;
			System.out.printf("[주문정보] %s 메뉴 %d개 주문 완료 \n", orderFood.name, orderCount);
		} else {
			System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
		}
	}

	// 푸드메뉴 선택하는 과정 담당 = 선택 메뉴의 인덱스 return
	int getFoodMenuIndex() {
		Scanner scanner = new Scanner(System.in);
		int orderMenu;

		while (true) {
			showFoodList();
			System.out.print(">>> 메뉴 번호 입력 : ");
			orderMenu = scanner.nextInt();

			if (orderMenu >= 1 && orderMenu <= foodList.size()) {
				break;
			} else {
				System.out.println(">>>잘못 입력했습니다.");
				System.out.println(">>>푸드 메뉴 보기중에 선택하세요.");
			}

		}
		int orderMenuIndex = orderMenu - 1;
		return orderMenuIndex;

	}
	
	void manageStock() {
		// 각 메뉴별 재고 수량 조정
		Scanner scanner = new Scanner(System.in);

		// 재고 조정할 메뉴 선택
		System.out.println(">>> 재고 관리할 메뉴 번호를 선택하세요.");
		int menuIndex = getFoodMenuIndex();

		// 조정할 재고 갯수 입력
		System.out.println(">>> 재고 조정할 개수 입력 : ");
		int inputStockCount = scanner.nextInt();
		
		foodList.get(menuIndex).modifyStock(inputStockCount);
		System.out.println("[재고 조정 적용]");
		System.out.println(foodList.get(menuIndex).getFoodInfo());
		System.out.println();
	}
	
	void finishSales() {
		System.out.println();
		System.out.println("=======[영업마감]=======");

		// 매출
		// 남은 재고 원가 차감 (판매금액의 30%)
		// 재고 남은 메뉴 = 메뉴가격 * 30% * 남은재고 수량

		int lossSales = 0;

		for (Food food : foodList) {
			lossSales += (food.price * 0.3 * food.stock);
		}

		System.out.println("=======[마감정보]=======");

		System.out.println("총매출액 : " + totalSales + "원");
		System.out.println("원가차감 : " + lossSales + "원");
		System.out.println("최종수익 : " + (totalSales - lossSales) + "원");

		isOpened = false;
		
	}
}

