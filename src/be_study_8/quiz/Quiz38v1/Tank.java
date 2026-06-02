package be_study_8.quiz.Quiz38v1;

public class Tank extends Unit {

	String mode = "탱크모드";

	void move(int x, int y) { // 지정된 위치로 이동
		super.move(x, y);
		System.out.printf("%d, %d 좌표까지 바퀴로 이동\n", x, y);
	}

	void changeMode() { // 공격 모드를 변환한다
		if (mode.equals("탱크모드")) {
			mode = "시즈모드";
			System.out.println(mode);
		} else if (mode.equals("시즈모드")) {
			mode = "탱크모드";
			System.out.println(mode);
		}
	}

}
