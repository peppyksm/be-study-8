package be_study_8.quiz.Quiz38v2;

//Class Unit
//abstract class Unit
//interface Unit ??? -> 필드변수X, 재정의하는 메소드 선언

public abstract class Unit {

	// 추상클래스화
	// Unit 이라는 객체를 생성하면 어색.

	int x, y; // 현재 위치

	abstract void move(int x, int y);
	// 직 접 정의x
	// 재정의 강제
	// 다형성을 위해서 부모클래스 쪽에 사용법 인지를 위해 선언

	void stop() {
		System.out.println("현재 위치에 정지");
	}

}

//interface Unit
//필드변수 x, 자녀클래스에서 재정의 할 메소드 선언만
//default void stop(int x, int y){
//	System.out.println("제자리에멈춰라");
//}