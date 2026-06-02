package be_study_8.quiz.Quiz40.q4;

class USD extends Currency{

	public USD(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	@Override
	public String toString() {
		return String.format("USD : %.2f %s", this.amount, this.notation);
	}
}