package be_study_8.quiz.Quiz40.q4;

public class Currency {
	double amount;
	String notation;
	
	public String toString() {
		return String.format("CUE : %.2f %s", this.amount, this.notation);
	}
}
