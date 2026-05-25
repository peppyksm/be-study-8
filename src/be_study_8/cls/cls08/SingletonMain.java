package be_study_8.cls.cls08;

public class SingletonMain {

	public static void main(String[] args) {
		
		//여러 객체 생성 가능하므로 싱글톤이 아님
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
		
//		Singleton s3 - new Singleton();
//		s3.Singleton; // 생성한 인스턴스 객ㅊ페를 통해 필드변수에 접근해야하는데..
		
//		Singleton s1 = Singleton.singleton; 
//		Singleton.singleton = new Singleton(); // 외부에서 생성 불가능
		
//		Singleton.singleton = null; //기존에 1개 생성된 객체 = null, 삭제
		
//		Singleton s3 = new Singleton();
//		s3.getInstance();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		//전부 같은 객체임
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s2);

	}

}
