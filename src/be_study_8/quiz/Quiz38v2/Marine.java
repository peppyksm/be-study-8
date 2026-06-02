package be_study_8.quiz.Quiz38v2;

public class Marine extends Unit{

	
	void move(int x, int y) { //지정된 위치로 이동
		super.move(x, y);
		System.out.printf("%d, %d 좌표까지 걸어서 이동\n",x,y);
	}
	
	void stimPack() { //스팀팩을 사용
		System.out.println("스팀팩 사용");
	}
}
