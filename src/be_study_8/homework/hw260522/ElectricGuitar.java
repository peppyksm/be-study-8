package be_study_8.homework.hw260522;

public class ElectricGuitar {

	String manufacturer;
	String model;
	String color;
	int price;
	int fret;
	int volume = 50;
	int tone = 5;
	int pickup;
	boolean isConnected;
	
	ElectricGuitar(String manufacturer, String model, String color, int price, int fret) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.price = price;
		this.fret = fret;
	}
	
	void info() {
		System.out.printf("제조사 : %s 모델명 : %s 색상 : %s 가격 : %d원 프렛수 : %d프렛\n",
				manufacturer, model, color, price, fret);
	}
	void cablePlugIn() {
		System.out.println("케이블 연결");
		isConnected = true;
	}
	
	void cablePlugOut() {
		System.out.println("케이블 분리");
		isConnected = false;
	}
	
	void tuning() {
		System.out.println("조율");
	}
	
	void pickupSelect(int value) {
		pickup = value;
		System.out.println(pickup + "단으로 픽업 셀렉트");
	}
	
	void toneUp() {
		System.out.println("톤 올리기");
		tone ++;
		System.out.println("현재 톤 : "+tone);
	}
	
	void toneDown() {
		System.out.println("톤 내리기");
		tone --;
		System.out.println("현재 톤 : "+tone);
	}
	
	void volumeUp(int value) {
		System.out.println("출력볼륨 올리기");
		volume += value;
		System.out.println("현재 볼륨 : "+volume);
	}
	
	void volumeDown(int value) {
		System.out.println("출력볼륨 내리기");
		volume -= value;
		System.out.println("현재 볼륨 : "+volume);
	}
	
	void soundOutput() {
		System.out.println("소리 출력");
	}
}
