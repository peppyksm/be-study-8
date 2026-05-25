package be_study_8.homework.hw260522;

public class Window {

	int width;
	int height;
	String location;
	boolean isOpend;
	boolean isLocked;
	boolean hasInsectScreen;

	Window(int width, int height, String location) {
		this.width = width;
		this.height = height;
		this.location = location;
	}
	
	void info() {
		System.out.printf("사이즈 : %d * %d 위치 : %s\n",width, height, location);
	}

	void windowOpen() {
		System.out.println("창문 열기");
		isOpend = true;
	}

	void windowClose() {
		System.out.println("창문 닫기");
		isOpend = false;
	}

	void windowLock() {
		System.out.println("창문 잠그기");
		isLocked = true;
	}

	void windowUnLock() {
		System.out.println("창문 잠김 해제");
		isLocked = false;
	}
}
