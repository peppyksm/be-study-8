package be_study_8.quiz.Quiz34;

public class Sink {

	int width;
	int height;
	int depth;
	String color;
	String meterial;

	Sink(int width, int height, int depth, String color, String meterial) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.color = color;
		this.meterial = meterial;
	}

	void sinkInfo() {
		System.out.println("===싱크대 정보===");
		System.out.printf("사이즈 : %d * %d * %d 색상 : %s 재질 : %s", width, height, depth, color, meterial);
	}
}