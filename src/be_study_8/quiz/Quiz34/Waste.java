package be_study_8.quiz.Quiz34;

public class Waste {

	int storage;
	String color;
	int storagefull = 50;
	boolean isOpend;

	Waste(int storage, String color) {
		this.storage = storage;
		this.color = color;
	}

	void addWaste() {
		storagefull++;
		System.out.println("현재 용량 : " + storagefull);
	}

	void open() {
		isOpend = true;
		System.out.println("쓰레기통이 열렸습니다.");
	}

	void close() {
		isOpend = false;
		System.out.println("쓰레기통이 닫혔습니다.");
	}

	void vacate() {
		storagefull = 0;
		System.out.println("쓰레기통을 비웠습니다.");
	}
}
