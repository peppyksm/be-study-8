package be_study_8.quiz.Quiz40.q2;


//basecode
public class InterfaceType {
	public static void main(String[] args) {

		// 객체 생성
		Food f1 = new Food("족발", 19800);
		Electronics e1 = new Electronics("에어팟", 199000);
		Clothing c1 = new Clothing("셔츠", 49900);
		
		Orderable[] Orderablethings = { f1, e1, c1 };

		// 총합 계산
		int sum = 0;
		
		for(int i = 0; i < Orderablethings.length; i++) {
			sum += Orderablethings[i].discountedPrice();
		}
		
		// 결과 출력
		System.out.println("총합: "+sum + "원");
	}
}
