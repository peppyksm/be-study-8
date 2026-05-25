package be_study_8.homework.hw260522;

public class Closet {

	int width;
	int height;
	int depth;
	int currentClothes;
	int currentHumidity;
	boolean isOpened;

	Closet(int width, int height, int depth, int currentClothes, int currentHumidity) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.currentClothes = currentClothes;
		this.currentHumidity = currentHumidity;
	}

	void info() {
		System.out.printf("옷장 사이즈 : %d* %d* %d 걸려있는 옷 수 : %d벌, 현재 습도 : %d도\n", 
				width, height, depth, currentClothes,currentHumidity);
	}

	void open() {
		System.out.println("옷장 열기");
		isOpened = true;
	}

	void close() {
		System.out.println("옷장 닫기");
		isOpened = false;
	}

	void addClothes() {
		System.out.println("옷 넣기");
		currentClothes++;
		System.out.println("현재 수납된 옷 : " + currentClothes + "벌");
	}

	void removeClothes() {
		System.out.println("옷 꺼내기");
		currentClothes--;
		System.out.println("현재 수납된 옷 : " + currentClothes + "벌");
	}

	void dehumidification(int value) {
		System.out.println("옷장 제습하기");
		currentHumidity -= value;
		System.out.printf("현재 습도 : %d도\n",currentHumidity);
	}

}
