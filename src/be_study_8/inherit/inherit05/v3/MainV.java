package be_study_8.inherit.inherit05.v3;

import java.util.ArrayList;
import java.util.List;

public class MainV {

	public static void main(String[] args) {
		
		
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
		
		//사용법이 같음
		for(Cleaner c : list) {
			c.doClean();
			//실행시 각자 재정의된 메소드로 실행
		}
		//동일한 사용법으로 다양한 실행 결과 도출 -> 다형성
		
		
		
		
	}
	
}
