package be_study_8.quiz.Quiz26;

public class Rectangle {
	
	int bottom;
	int height;
	
	Rectangle(int bottom, int height){
		this.bottom = bottom;
		this.height = height;
	}
	
	int getArea() {
		int result = bottom*height;
		return result;
	}
	
}
