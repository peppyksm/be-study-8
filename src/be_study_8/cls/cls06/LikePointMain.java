package be_study_8.cls.cls06;

public class LikePointMain {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(n);
		
		n = 20;
		System.out.println(n);
		
		final int x = 30;
		System.out.println(x);
		//x=300;   final 값 -> 초기화 이후 변경 불가
		
		System.out.println(LikePoint.staticX);
		//System.out.println(LikePoint.finalX);
		LikePoint lp1 = new LikePoint();
		System.out.println(lp1.finalX);
		
		LikePoint.staticX = 50;
		System.out.println(LikePoint.staticX); //값이 여기서 바뀌어 어떤 객체로 선언으로 해도 50으로 바껴있음
		
		//LikePoint.finalX = 99;  //변경 자체가 안됨. 초기화 한 시점에서 값 바꿔줘야함
		
		
		LikePoint lp2= new LikePoint("선호도");
		System.out.println(lp2.category);
		//lp2.category = "흥미도"; 
		
		System.out.println(LikePoint.VERY_GOOD);
		System.out.println(LikePoint.VERY_BAD);
		System.out.println(LikePoint.NORMAL);
		
		int point = 5;
		if(point == LikePoint.NORMAL) {
			System.out.println("보통");
		}
		
		switch(point) {
		case LikePoint.VERY_GOOD: System.out.println("매우 좋음"); break;
		case LikePoint.GOOD: System.out.println("좋음"); break;
		case LikePoint.NORMAL: System.out.println("보통"); break;
		case LikePoint.BAD: System.out.println("나쁨"); break;
		case LikePoint.VERY_BAD: System.out.println("매우나쁨"); break;
		}
		
		
	}

}
