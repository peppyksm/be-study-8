package be_study_8.quiz.Quiz34;

import java.util.ArrayList;

public class Kitchen {

	
	double square;
	String wallColor;
	int floorHeight;
	
	Refrigerator refrigerator;
	Gas gas;
    Sink sink;
    
    //여러개 사용시 ArrayList 사용
    ArrayList<Waste> wasteList;
    ArrayList<Cup> cupList;
    
    
	
	Kitchen(double square, String wallColor, int floorHeight){
		this.square = square;
		this.wallColor = wallColor;
		this.floorHeight = floorHeight;
	}
	
	void kitchenInfo() {
		System.out.println("===주방 정보===");
		System.out.printf("공간 : %df평 벽지색상 : %s 층고 : %dm", square, wallColor, floorHeight);
	}
	
}
