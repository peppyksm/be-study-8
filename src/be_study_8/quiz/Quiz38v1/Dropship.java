package be_study_8.quiz.Quiz38v1;

public class Dropship extends Unit {
	
	int count = 0;
	
	void move(int x, int y) { //지정 위치로 이동
		super.move(x, y);
		System.out.printf("%d, %d 좌표까지 날아서 이동\n",x,y);
	}
	
	void load() {  //선택된 대상을 태운다
		count++;
		System.out.println("대상 태움");
	}
	
	void unload() {  //선택된 대상을 내린다
		count--;
		System.out.println("대상 내림");
	}
}
