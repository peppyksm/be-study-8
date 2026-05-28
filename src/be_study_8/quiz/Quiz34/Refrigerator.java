package be_study_8.quiz.Quiz34;

public class Refrigerator {

	String brand;
	int storage;
	boolean inPowerOn;
	int temperature = 2;
	int door;
	
	IceTray iceTray;

	
	Refrigerator(String brand, int storage, int door) {
		this.brand = brand;
		this.storage = storage;
		this.door = door;
	}

	void powerOn() {
		inPowerOn = true;
		System.out.println("전원이 켜졌습니다");
	}
	
	void powerOff() {
		inPowerOn = false;
		System.out.println("전원이 꺼졌습니다");
	}
	
	void tempUp() {
		temperature++;
		System.out.println("현재 온도 : "+ temperature);
	}
	
	void tempDown() {
		temperature--;
		System.out.println("현재 온도 : "+ temperature);
	}
}
