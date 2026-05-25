package be_study_8.cls.cls05;

public class Galaxy {

	// 필드변수

	// 인스턴스 멤버 -> 각 인스턴스 객체가 개별적으로 가지고 있는 변수
	String owner; // 소유주
	String model; // 상세 모델

	// 정적 멤버 -> static 변수

	// 객체 생성 안해도 이미 존재
	static String madeby = "삼성";
	
	// 클래스에서 공통으로 사용
	// 각 개체별로 가지고 있을 필요 없음
	// 각 개체가 접근해도 같은 값에 접근

	//인스턴스 메소드
	void showInfo() { //가지고 있는 정보를 출력
		System.out.println(owner + "님의 "+ model+ " 상품 입니다.");
		System.out.println("저는 "+ madeby + "에서 만들어졌어요."); // 인스턴스에서 스태틱은 사용 가능
	}
	
	static void showMadeBy() {
		System.out.println(madeby + "에서 만든 갤럭시 상품입니다.");
		//System.out.println(owner);							스태틱에서 인스턴스는 사용 불가능
	}
}
