package be_study_8.quiz.Quiz34;

public class KitchenMain {

	public static void main(String[] args) {

		Kitchen kitchen = new Kitchen(5, "하얀색", 2);
		Refrigerator Refr = new Refrigerator("삼성", 300, 3);
		Gas gas = new Gas(3, "경동", 249000);
		Sink sink = new Sink(630, 360, 200, "Steel", "스테인리스");
		Waste w1 = new Waste(30, "검은색");
		Waste w2 = new Waste(20, "회색");
		Cup c1 = new Cup(300, "유리", "투명색");
		Cup c2 = new Cup(200, "도자기", "노란색");
	}

}