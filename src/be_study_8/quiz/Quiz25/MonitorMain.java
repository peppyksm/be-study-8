package be_study_8.quiz.Quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		
		Monitor m1 = new Monitor(27, "HANSUNG", "TFG27F16V");
		Monitor m2 = new Monitor(32, "SAMSUNG", "LS32D70");
		Monitor m3 = new Monitor(24, "LG", "24U421A");
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();

	}

}