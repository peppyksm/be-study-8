package be_study_8.quiz.Quiz40.q4;

class KRW extends Currency{

	public KRW(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	@Override
	public String toString() {
		return String.format("KRW : %.2f %s", this.amount, this.notation);
	}
}