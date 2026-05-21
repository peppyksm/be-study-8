package be_study_8.quiz.gptpractice;

public class Account {

	String owner;
	int balance;
	
	void deposit(int money) {
		System.out.printf("%s님 계좌 +%d원 입금\n", owner, money);
		balance += money;
		System.out.println("현재 잔액 : "+ balance);
	}
	
	void withdraw(int money) {
		System.out.println(owner + "님 계좌 -" + money+ "원 출금");
		balance -= money;
		System.out.println("현재 잔액 : "+ balance);
	}
	
}