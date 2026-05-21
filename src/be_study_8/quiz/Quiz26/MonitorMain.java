package be_study_8.quiz.Quiz26;

public class MonitorMain {

	public static void main(String[] args) {
		
		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.color = "검은색";
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		m1.setXY(1080,780);
		
		m2.setColor("흰색");
		m2.setXY(4096,2048);
		
		m1.info();
		m2.info();
		
		System.out.println("인상 후 총금액:"+m2.priceUp(70000)+"원");
		
		m1.info();
		m2.info();
	}
}