package be_study_8.inherit.inherit01;

public class Child extends Parent {// extends 상속받을 부모 클래스

	String school;
	int grade;

	Child() {
		// super(); //부모생성자 호출, 작성 안해도 자동

		// 부모에 기본생성자 없으면 직접 부모생성자 호출
		super(0); // super(받는 매개변수);

		System.out.println("Child() 생성자 호출됨");
	}

	Child(String school, int grade) {

		super(0); // 자식 호출자를 사용할땐 항상 부모 먼저 호출

		// 그 다음 자식 생성자에서 실행할 코드 작성
		this.school = school;
		this.grade = grade;
	}

	Child(String school, int grade, int money) {
		super(money);
		this.school = school;
		this.grade = grade;
	}

	void play() {
		System.out.println("나가서 뛰어 놀기");
	}
	
	void printInfo() {
		System.out.println(school + " " + grade + " "+ money);
		System.out.println(age);//GrandParent를 상속 받는 Parent를 상속받는 Child)
	}
}
