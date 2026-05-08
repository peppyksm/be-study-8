package be_study_8.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		int price = 12000;
		String result=(price > 12000) ? "물로배채우기" : (price > 8000) ? "눈물" : (price > 6000) ? "선방" : "훌륭";
		System.out.println(result);
	}

}
