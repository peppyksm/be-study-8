package be_study_8.cls.cls07.pack3;

public class PointMain {

	public static void main(String[] args) {
		
		//index 기준
		int[] mathArr; 	//1 2 3
		int[] langArr; 	//1 2 3
		int[] engArr;	 //1 2 3
		
		Point p1 = new Point();
		
		p1.math = 90;
		//p1.lang = 100;  private이라 접근 불가
		p1.eng = 50;
		
		p1.method1();
		p1.method2();
		//p1.method3(); private라 못부름
		
		p1.math = 55;  //직접 접근 값 저장
		System.out.println(p1.math); //setter 메소드를 통해 값을 전달해서 값 저장
		
		p1.setMath(55);
		System.out.println(p1.getMath());
		
		p1.setLang(100); //필드변수가 private로 돼있지만 메소드는 public이라 접근 가능 (public인 메소드에게 값을 부여하면 메소드가 같은 클래스인 private 변수에게 접근
		System.out.println(p1.getLang());
		
		//eng 60점
		p1.eng = 60; //점수 범위 0 ~ 100
		
		p1.eng = -50; //직접 접근 = 잘못된 범위의 값
		
		p1.setEng(50);
		System.out.println(p1.getEng());
		
		System.out.println(p1.getLang());
		
	}

}
