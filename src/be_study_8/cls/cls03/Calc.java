package be_study_8.cls.cls03;

public class Calc {

	// 계산기 객체
	// Calculator

	// 필드
	// 생성자
	// 메소드

	/*
	 * 리턴타입 메소드명(매개변수){ 실행문 return... }
	 * 
	 * 리턴 매개변수 O O O X X O X X
	 * 
	 * 리턴타입 : 결과로 반환할 데이터의 타입 (String, int, double ...) 반환할 것이 없으면 void
	 */

	// 계산기 전원 켜기 - > 리턴 X 매개변수 X

	void powerOn() {
		System.out.println("power on");
		//return; void에서 return -> 메소드 실행 종료
		//메소드에서 return은 반복문의 break와 같은 역할도 함
	}

	// 계산기 소유자 이름 등록 - > 리턴X 매개변수 O (소유자 이름 전달)
	void setOwner(String name) {
		System.out.println(name + "님 소유자로 등록되었습니다.");
	}

	// 계산기 계산 수행 - > 리턴O 매개변수O (더하기 더할 숫자 값 전달)
	int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	double sum(double n1, double n2) { // 타입이 달라 가능
		double result = n1 + n2;
		return result;
	}

	// 메소드 오버로딩 (매개변수의 타입, 순서, 갯수) : 메소드 호출하는 시점에 어떤 메소드인지 구분 가능해야함
	// return 타입이 다른 것은 오버로딩 조건에 포함되지 않는다. (매개변수의 타입이 아님)

//	String sum(int n1, int n2) {  //매개변수 int int 순서로 2개 중복
//		String result = n1 + n2 + " ";
//		return result;
//	}

	// calc calc.sum(10,20) calc.sum(10, 20, 30) calc.sum(10.5, 33.5)
//												calc.sum(11.5, 30)
	// 매개변수 타입 순서 갯수
	int sum(int n1, int n2, int n3) { // 갯수가 달라 가능
		int result = n1 + n2 + n3;
		return result;
	}
	
	double divide(int x, int y){
		double result = 	(double)x / y;
		return result;
		
	}
	
	//리턴 O 매개변수 X
	//배터리 잔여량 확인 메소드
	
	int checkBattery() {
		//배터리 잔여 퍼센트
		return 80;
	}
	
	//제조사 (회사) 확인 메소드
	String madeByInfo() {
		return "카시오";
	}
	
	
}
