package be_study_8.cond;

public class Cond01 {

	public static void main(String[] args) {

		// 조건문 if 문
		// if(조건식) -> 조건식이 참이면 실행

		int num = 15;
		int x = 3;

		if (num > 5) {
			System.out.println("num이 5보다 크다");
			System.out.println("if문 안 {} 실행");

			int y = 20;

		}

		x = 20;
		// y = 500; if문 내부 로컬 변수
		// 새로운 y 선언은 가능
		int y = 5;

		if (num < 10) {
			System.out.println("num이 10보다 작다");
			System.out.println("num이 작다");
			y = 10;
		} else {// 바로 위 if문이 거짓이면 실행, if문 없이 단독 실행 불가
			System.out.println("num이 10보다 작지 않다");
		}

		boolean bool1 = (num != 15);

		// if문이 true false로 동작하므로 boolean 변수 넣어도 작동함
		if (!bool1) {
			System.out.println("num이 15랑 같은 수");
		} else {
			System.out.println("num이 15랑 다른 수");
		}

		System.out.println("end");
	}

}
