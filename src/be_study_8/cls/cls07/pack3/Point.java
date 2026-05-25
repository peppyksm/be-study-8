package be_study_8.cls.cls07.pack3;

public class Point {
	
	//점수관리
	int math;
	private int lang; //이 클래스에서만 접근 가능
	public int eng; //접근 공개
	
	public Point() {
		
	}
	public Point(int math, int eng, int lang) {
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}
	
	void method1() { //default
		System.out.println("method1");
	}
	
	public void method2() {
		System.out.println("method2");
	}
	
	private void method3() {
		System.out.println("method3");
	}
	
//	Getter Setter
//	Getter : get 가져오기 값을 읽어오겠다 return 값
//	Setter : set 세팅한다 값을 저장하겠다 변수 = 값
//	
//	getXXX setXXX
	
	public int getMath(){
		return math;
	}
	
	public int getEng(){
		return this.eng;
		}
	
	public int getLang(){
		//return this.lang;
		//저장 0~100 저장
		//실제 점수를 1000점 만점으로 환산
		return this.lang*10;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setEng(int eng) {
		//로직 추가
		//0~100점 정상범위 = 그대로 저장
		//범위 잘못되면 실수 = 0점
		
		if(eng >= 0 && eng <= 100) {
			this.eng = eng;
		}else {
			this.eng = 0;
		}
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	
	
	
	
}
