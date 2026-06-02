package be_study_8.quiz.Quiz38v1;

public class Unit {

	int x,y; //현재 위치
	
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void stop() {
		System.out.println("현재 위치에 정지");
	}
	
}