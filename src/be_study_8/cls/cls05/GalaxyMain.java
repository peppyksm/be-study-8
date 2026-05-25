package be_study_8.cls.cls05;

public class GalaxyMain {

	public static void main(String[] args) {
		
		//static은 클래스명.변수명 으로 바로 접근 가능
		System.out.println("정적 멤버 : "+ Galaxy.madeby);
		Galaxy.showMadeBy();
		
		Galaxy g1 = new Galaxy();
		g1.owner = "이회장";
		g1.model = "갤럭시S26울트라";
		
		g1.showInfo();
		System.out.println(g1.madeby); //선언은 되나 객체명 말고 아래처럼 클래스명으로 선언하는게 맞음
		System.out.println(Galaxy.madeby); 
		
		Galaxy g2 = new Galaxy();
		g1.owner = "김부장";
		g1.model = "갤럭시Z플립10";
		
		g2.showInfo();
		System.out.println(g2.madeby);
		System.out.println(Galaxy.madeby); 
		g2.showMadeBy();
		
		System.out.println(Math.random());  //~~.~~() 형식으로 된게 다 static이었던거임
		
		System.out.println(3*3*Math.PI);
	}

}
