package be_study_8.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		
		Calc c1 = new Calc();
		
		//c1.name = "이름";		필드변수접근
		//	클래스변수명.필드변수명
		
		//메소드 호출
		//클래스변수명.메소드명();
		
		c1.powerOn(); //메소드 호출(실행)	괄호 필수
		
		//c1.powerOn();		매개변수가 없는 powerOn 이름의 메소드 호출
		//c1.powerOn = true; powerOn 이라는 이름의 필드변수가 있구나
		
		c1.setOwner("김승민");
		
		
		Calc c2 = new Calc();
		c2.powerOn();
		c2.setOwner("김승민2");
		
		int result1 = c2.sum(10, 20);
		System.out.println(result1); //10+20
		
		System.out.println(c2.sum(30, 50));  //30+50
		
		double result2 = c2.divide(30, 7);
		System.out.println(result2);
		System.out.println(c2.divide(30, 7));
		
		int result3 = (int)c2.divide(30, 7);
		System.out.println(result3);
		
		c2.checkBattery();
		
		int cb = c2.checkBattery();
		System.out.println("잔여 배터리량 : "+cb);
		  
		System.out.println("계산기 제조사 : " + c2.madeByInfo());

		String info = c2.madeByInfo();
		
		//sumInt( 10, 20)
		//sumDouble( 10.5, 20.3)
		//위처럼 메소드마다 이름을 다르게해서 만들어도 되지만 오버로딩 하는 방향이 더 편한 경우가 많음
		
		//prinln 메소드 오버로딩
		System.out.println(1234);  //printlnInt X
		System.out.println(29.133); //printlnDouble X
		System.out.println("문자열");	//String
		System.out.println(true);	//boolean
		
		
	}

}
