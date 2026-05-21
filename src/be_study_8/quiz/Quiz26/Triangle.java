package be_study_8.quiz.Quiz26;

public class Triangle {
	
	int bottom;
	int height;
	
	void setSize(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	Double getArea() {
		Double result = (double)bottom * height / 2;
		return result;
	}

}
