package be_study_8.quiz.Quiz39;

public class ExcerciseInstanceof {
	public static void main(String[] args) {

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	}

	static void action(Robot robot) {

		if (robot instanceof DanceRobot) {
			((DanceRobot) robot).dance();
			
		} else if (robot instanceof SingRobot) {
			((SingRobot) robot).sing();
			
		} else if (robot instanceof DrawRobot) {
			((DrawRobot) robot).draw();
		}
	}
}