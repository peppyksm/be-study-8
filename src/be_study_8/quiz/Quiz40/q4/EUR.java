package be_study_8.quiz.Quiz40.q4;

class EUR extends Currency{


	public EUR(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	@Override
	public String toString() {
		return String.format("EUR : %.2f %s", this.amount, this.notation);
	}
}