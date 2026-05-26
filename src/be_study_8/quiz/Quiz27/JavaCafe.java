package be_study_8.quiz.Quiz27;

public class JavaCafe {

	public static void main(String[] args) {

		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);

	}

// 시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) {

		// 잘못된거 걸리면 계산 의미 없으므로 return으로 메소드 정지
		if (basePay < 8) {
			System.out.println("최저 시급 에러!");
			return;
		}
		if (hours > 60) {
			System.out.println("초과 근무시간 에러!");
			return;
		}

		double pay;

		if (hours <= 40) {
			pay = basePay * hours;
		} else {
			pay = (basePay * 40) + ((hours - 40) * basePay * 1.5);
		}
		System.out.printf("$ %.2f\n", pay);
	}
}