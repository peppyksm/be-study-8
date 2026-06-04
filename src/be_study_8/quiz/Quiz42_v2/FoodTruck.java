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
				for (int i = 0; i < foodList.size(); i++) {

					Food f = foodList.get(i);
					System.out.printf("%d. %s\n", (i + 1), f.getFoodInfo());
				}
				break;
			case 2: // 주문하기
				// 메뉴 보여주기
				for (int i = 0; i < foodList.size(); i++) {

					Food f = foodList.get(i);
					System.out.printf("%d. %s\n", (i + 1), f.getFoodInfo());
				}
				// 주문 메뉴 번호 받기
				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				int orderMenu = scanner.nextInt();
				int orderMenuIndex = orderMenu - 1;

				// 주문메뉴 재고수량 - 수량
				// 주문 메뉴 금액만큼 매출액 증가
				// 재고수량 부족하면 품절, 주문 불가
				int orderCount = 1;

				if (foodList.get(orderMenuIndex).stock >= orderCount) {

					foodList.get(orderMenuIndex).modifyStock(-orderCount);
					totalSales += foodList.get(orderMenuIndex).price;
					System.out.printf("[주문정보] %s 메뉴 %d개 주문 완료 \n", foodList.get(orderMenuIndex).name, orderCount);
				} else {
					System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
				}

				// 주문 수량
				break;
			case 3: // 재고관리

				// 각 메뉴별 재고 수량 조정

				// 메뉴 보여주기
				for (int i = 0; i < foodList.size(); i++) {

					Food f = foodList.get(i);
					System.out.printf("%d. %s\n", (i + 1), f.getFoodInfo());
				}
				// 재고 조정할 메뉴 선택
				System.out.print(">>> 재고 관리할 메뉴 번호 입력 : ");
				int input = scanner.nextInt();

				// 조정할 재고 갯수 입력
				System.out.println(">>> 재고 조정할 개수 입력 : ");
				int inputStockCount = scanner.nextInt();
				foodList.get(input - 1).modifyStock(inputStockCount);
				System.out.println("[재고 조정 적용]");
				System.out.println(foodList.get(input - 1).getFoodInfo());
				System.out.println();

				break;
			case 4: // 마감하기

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
				break;
			}

			// 선택 메뉴에 따라 기능 수행

		}

	}

}
