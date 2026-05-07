package be_study_8.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		

		String brandName = "로지텍";
		String productName = "mx keys";
		int productPrice = 135000;
		String serialNumbe = "332L1545K";

		

		String companyName = "SAMSUNG";
		int monitorInch = 24;
		String monitorColor = "black";
		boolean hasHdmiPort = true;
		boolean canSoundOutput = false;
		


		double pi = 3.14;
		System.out.println("원주율 : "+pi);
		

		
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		int result = Integer.parseInt(mathScore) + Integer.parseInt(englishScore) + Integer.parseInt(artScore);
		System.out.println("총점 = " + result);


		
		int num1 = 4;
		int num2 = 10;
		double num3 = (double)num1 / num2;
		System.out.println(num3);
	}
}
