package be_study_8.quiz.Quiz27;

public class Gamble {

	public static void main(String[] args) {
		
		
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
	}

	public static int dice() {
		int diceNum = (int) (Math.random() * 6 + 1);

		return diceNum;
	}

	public static double exchange(double dollar) {
		return dollar * 1082.25108;
	}
}