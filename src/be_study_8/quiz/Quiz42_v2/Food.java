package be_study_8.quiz.Quiz42_v2;

public class Food {

	String name;
	int price;
	int stock;

	Food(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	// Food 자체 정보 String 반환
	// toString();
	String getFoodInfo() {
		return String.format("%s 가격:%d원, 재고:%d개", name, price, stock);
	}

	void modifyStock(int index) {
		stock += index;
		if (stock <= 0) {
			stock = 0;
		}
	}
}
