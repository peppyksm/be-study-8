package be_study_8.inherit.inherit03;

public class WirelessMike extends Mike{

	//무선마이크
	//type model price
	//volumeUp check
	
	//메소드 재정의(오버라이딩) - 부모클래스 메소드를 덮어써서 재정의
	public void volumeUp() { //부모 매소드와 매개변수, 공개범위, 이름이 같아야함
		System.out.println("WirelessMike volumeUp() 재정의");
	}
	
	
	
}
