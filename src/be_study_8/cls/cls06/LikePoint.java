package be_study_8.cls.cls06;

public class LikePoint {

	//static final 상수형 변수명은 모두 대문자로 표현, _로 구분, ENUM이랑 비슷
	static final int VERY_GOOD = 5;
	static final int GOOD = 4;
	static final int NORMAL = 3;
	static final int BAD = 2;
	static final int VERY_BAD = 1;
	
	static int staticX = 1;
	final int finalX = 5;
	
	final String category;
	
	LikePoint(){
		category = null;
	}
	
	LikePoint(String category){
		this.category = "";    //final 선언만 하고 초기화 안했을 시 생성자에서라도 초기화 필요
	}
	
}
