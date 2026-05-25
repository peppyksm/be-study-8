package be_study_8.cls.cls08;

public class Singleton {
	
	
	//Singleton singleton;
	private static Singleton singleton = new Singleton();
	
	//private 접근제한자 = 외부에서 접근 불가
	//외부에서 생성자 호출 x = 외부에서 객체 생성 불가
	private Singleton() {
//		singleton = new Singleton();
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
}
