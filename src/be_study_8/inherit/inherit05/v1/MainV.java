package be_study_8.inherit.inherit05.v1;

import java.util.ArrayList;

public class MainV {

	public static void main(String[] args) {
		
//		DustCleaner dc1 = new DustCleaner();
//		DustCleaner dc2 = new DustCleaner();
//		DustCleaner dc3 = new DustCleaner();
//		dc1.removeDust();
//		dc2.removeDust();
//		dc3.removeDust();
		
		DustCleaner[] dustArr = new DustCleaner[3];
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();
		
		ArrayList<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		ArrayList<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		for(int i = 0; i < dustArr.length; i++) {
			dustArr[i].removeDust();
		}
		
		for(int i = 0; i < floorList.size(); i++) {
			floorList.get(i).cleanFloor();
		}
		
		for(WindowCleaner wc : windowList) {
			wc.washWindow();
		}

	}

}
