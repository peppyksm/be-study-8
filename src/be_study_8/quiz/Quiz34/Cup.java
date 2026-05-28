package be_study_8.quiz.Quiz34;

public class Cup {

	int storage;
	String material;
	String color;

	Cup(int storage, String material, String color) {
		this.storage = storage;
		this.material = material;
		this.color = color;
	}

	void cupInfo() {
		System.out.println("====컵 정보====");
		System.out.printf("용량 : %d 재질 : %s 색상 : %s", storage, material, color);
	}
}