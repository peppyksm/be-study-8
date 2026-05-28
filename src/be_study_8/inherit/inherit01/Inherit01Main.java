package be_study_8.inherit.inherit01;
import be_study_8.inherit.inherit02.HideChild;

public class Inherit01Main {

	public static void main(String[] args) {

		// 개별적인 객체
		// Parent p1 = new Parent();
		Parent p1 = new Parent(5000);
		p1.money = 5000;
		p1.work();

		Child c1 = new Child();
		c1.school = "남부초등학교";
		c1.grade = 5;
		c1.play();

		// Parent로부터 상속받아서 Parent의 필드변수, 메소드 이용 가능
		c1.money = 1000;
		c1.work();

		Child c2 = new Child("서초등학교", 3);
		c2.money = 100;

		Child c3 = new Child("동초등학교", 2, 300);
		System.out.println(c3.school);
		System.out.println(c3.grade);
		System.out.println(c3.money);
		
		c3.printInfo();
		
		
		//다른 패키지의 main 메소드에서 호출 할 경우
		//다른 패키지의 클래스파일 호출자가 public 이어야함
		HideChild hc1 = new HideChild(200);
		hc1.showMoney();
	}

}
