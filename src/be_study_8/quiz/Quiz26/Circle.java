package be_study_8.quiz.Quiz26;

public class Circle {
	int radius;
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	Double getArea() {
		Double result = radius * radius * 3.14;
		return result;
	}
}
