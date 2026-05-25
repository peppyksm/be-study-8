package be_study_8.homework.hw260522;

public class AirConditioner {

	String manufacturer;
	String model;
	String color;
	int temperature;
	int windPower = 5;
	String mode;
	int powerConsumption;
	boolean ispowerOn;

	AirConditioner(String manufacturer, String model, String color) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
	}

	void info() {
		System.out.printf("제조사 : %s 모델명 : %s 색상 : %s\n", manufacturer, model, color);

	}

	void PowerOn() {
		System.out.println("전원 켜기");
		ispowerOn = true;
	}

	void PowerOff() {
		System.out.println("전원 끄기");
		ispowerOn = false;
	}

	void setTemperature(int value) {
		temperature = value;
		System.out.println(temperature + "도로 온도 설정");
	}

	void windPowerUp() {
		System.out.println("바람세기 올리기");
		windPower++;
		System.out.println("현재 바람 세기 : " + windPower);
	}

	void windPowerDown() {
		System.out.println("바람세기 내리기");
		windPower--;
		System.out.println("현재 바람 세기 : " + windPower);
	}

	void mode(String value) {
		mode = value;
		System.out.println(mode + " 모드로 설정");
	}
}
