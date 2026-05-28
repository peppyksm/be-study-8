package be_study_8.inherit.inherit01;

public class Parent extends GrandParent {

	//int money; //default
	//public int money   상속, 접근 당연히 됨 (default보다 상위)
	//private int money  상속 접근 안됨
	protected int money;   //같은 패키지 + 자식이면 가능

//	Parent(){
//		System.out.println("Parent() 생성자 호출됨");
//	}

	
//	Parent(int money) {
//		System.out.println("Parent(int money) 생성자 호출됨");
//		this.money = money;
//	}
	//다른 패키지의 자식의 경우
	//부모의 생성자에 public or private 넣어줘야함
	public Parent(int money) {
		System.out.println("Parent(int money) 생성자 호출됨");
		this.money = money;
	}
//		System.out.println("Parent(int money) 생성자 호출됨");
//		this.money = money;
//	}

	void work() {
		System.out.println("열심히 일하는 중");
	}

}
