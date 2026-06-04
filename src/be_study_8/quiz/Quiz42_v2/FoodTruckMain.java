package be_study_8.quiz.Quiz42_v2;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		FoodTruck ft1 = new FoodTruck("분식트럭");
		
		ft1.addFood("김밥", 4000, 5);
		ft1.addFood("떡볶이", 6000, 5);
		ft1.addFood("순대", 7000, 5);
		
		ft1.startSales();
		
		

	}

}
