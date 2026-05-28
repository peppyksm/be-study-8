package be_study_8.quiz.Quiz32;

class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;

	// 생성자
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}

	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		
		int sum = 0;
		
		for(int i = 0; i < menus.length; i++) {
			sum += menus[i].price;
		}
		return sum;
	}
}

class Menu {
	// 필드
	String name;
	int price;

	// 생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}
}