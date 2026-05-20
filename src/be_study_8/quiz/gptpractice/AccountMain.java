package be_study_8.quiz.gptpractice;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.owner = "김철수";
		a1.balance = 1000;
		
		a1.deposit(500);
		a1.withdraw(300);
		

	}

}
