package be_study_8.quiz.Quiz40.q4;

class JPY extends Currency{

	public JPY(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	@Override
	public String toString() {
		return String.format("JPY : %.2f %s", this.amount, this.notation);
	}
}
