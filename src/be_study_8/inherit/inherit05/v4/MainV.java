package be_study_8.inherit.inherit05.v4;


import java.util.ArrayList;
import java.util.List;



public class MainV {

	public static void main(String[] args) {

		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner(); // 부모탑 = 자식객체

		// 강제타입변환
		DustCleaner dc1 = (DustCleaner) c2;
		//DustCleaner dc2 = (DustCleaner) c1;

		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();

		FloorCleaner fc = (FloorCleaner) c3;
		WindowCleaner wc = (WindowCleaner) c4;
		//WindowCleaner wc2 = (WindowCleaner) c3;

		
		
		
		List<Cleaner> list = new ArrayList<>();

		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());

		// 사용법이 같음
		for (Cleaner c : list) {
			c.doClean();
			// 실행시 각자 재정의된 메소드로 실행
			
			
			//본체에 들어있는게 어떤 클래스의 인스턴스냐? 그 클래스 출신 
			//c가 DustCleaner의 출신인지 확인 하고 아니면 실행 x
			if(c instanceof DustCleaner) {
				DustCleaner dcc = (DustCleaner)c;
				dcc.arrangeItem();
			}
			
		}
		// 동일한 사용법으로 다양한 실행 결과 도출 -> 다형성

	}

}
