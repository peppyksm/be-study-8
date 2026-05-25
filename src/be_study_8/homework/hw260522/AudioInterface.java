package be_study_8.homework.hw260522;

public class AudioInterface {

	String manufacturer;
	String model;
	String color;
	int currentCableCount;

	AudioInterface(String manufacturer, String model, String color) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
	}

	void info() {
		System.out.printf("제조사 : %s 모델명 : %s 색상 : %s\n", manufacturer, model, color);
	}

	void instrumentConnect() {
		System.out.println("악기 연결");
		currentCableCount++;
		System.out.println("현재 Input : " + currentCableCount);
	}

	void instrumentDisconnect() {
		System.out.println("악기 연결 해제");
		currentCableCount--;
		System.out.println("현재 Input : " + currentCableCount);
	}

	void micConnect() {
		System.out.println("마이크 연결");
		currentCableCount++;
		System.out.println("현재 Input : " + currentCableCount);
	}

	void micDisconnect() {
		System.out.println("마이크 연결 해제");
		currentCableCount--;
		System.out.println("현재 Input : " + currentCableCount);
	}

	void directMonitor() {
		System.out.println("Input 원음 모니터링");
	}

	void soundInput() {
		System.out.println("소리 기기에 입력");
	}

	void soundOutput() {
		System.out.println("기기의 소리 출력");
	}

	void loopBack() {
		System.out.println("Output 사운드 Input하기");
	}

}
