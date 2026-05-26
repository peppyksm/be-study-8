package be_study_8.cls.cls11;

public class ReturnMain {

	public static void main(String[] args) {

		// return 기본타입
		// return 배열
		// return ArrayList
		// return 객체;

		// 데이터 전달을 위한 포장용도로 클래스

		// 성적
		// 국어 수학 영어

		AllScore score = getScore();  //메인객체 생성해 getScore() 덮어씌움

		System.out.println(score.lang);    //getScore()를 리턴받아 
		System.out.println(score.math);    //getScore()에서 초기화한 필드변수 출력
		System.out.println(score.eng);

	}

	public static AllScore getScore() {

		AllScore as = new AllScore(); // 점수 저장할 필드변수 클래스를 만들고 객체를 만들어서
		as.lang = 70; // 점수 저장 후 main의 객체에 덮어 쓰는 것
		as.math = 90;
		as.eng = 80;

		return as;
	}

	// 점수 3개를 한번에 전달
	public static int scoreInfo() {
		// return은 무조건 한개만 반환 가능
		return 709080;
		// return 70|90|80;
		// return "70,90,80"; 여러개의 정보전달이 어려움.

	}

	public static int mathScore() {
		return 90; // 한개의 값 리턴만 가능
	}

	public static int engScore() {
		return 80;
	}

}
