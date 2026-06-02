package be_study_8.quiz.Quiz38v1;

public class UnitMain {

	public static void main(String[] args) {

		Dropship d1 = new Dropship();
		Marine m1 = new Marine();
		Tank t1 = new Tank();

		Unit[] arr = { t1, d1, m1 };

		for (Unit u : arr) {
			u.move(10, 20);
			u.stop();
		}

		t1.changeMode();
		m1.stimPack();
		d1.load();
		d1.unload();

	}

}
