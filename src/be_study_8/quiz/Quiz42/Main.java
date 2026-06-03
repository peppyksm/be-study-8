package be_study_8.quiz.Quiz42;


public class Main {

	public static void main(String[] args) {

		Food f1 = new Food("김밥", 4000);
		Food f2 = new Food("떡볶이", 6000);
		Food f3 = new Food("순대", 7000);

		FoodTruck foodTruck1 = new FoodTruck();
		Food[] menu = { f1, f2, f3 };

		foodTruck1.addMenu(f1);
		foodTruck1.addMenu(f2);
		foodTruck1.addMenu(f3);
		
		foodTruck1.setStock(5);
		foodTruck1.setStock(5);
		foodTruck1.setStock(5);
		
		
		foodTruck1.run();

	}
}
