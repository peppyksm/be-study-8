package be_study_8.cls.cls02;

public class PhoneMain {

	public static void main(String[] args) {
		
//		Phone p1 = new Phone();
//		매개변수 없는 생성자가 선언되어 있지 않으면 생성 불가
		
		Phone p2 = new Phone("갤럭시 S26");
		
		Phone p3 = new Phone("아이폰 10", 990000);
//		Phone p3 = new Phone("아이폰 10", 3300);
//							  모델명      배터리용량  이렇게 넣어도 배터리용량은 price로 들어감
//		생성자가 model, price 순으로 생성되었기 때문
		
		Phone p4 = new Phone(4000, "갤럭시Z플립");
		
		Phone p5 = new Phone("갤럭시 폴드4", 210000, 4200);
		
	}

}
