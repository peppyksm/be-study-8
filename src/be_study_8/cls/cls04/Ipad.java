package be_study_8.cls.cls04;

public class Ipad {

	//필드
	String owner; //소유자 정보
	
	
	
	//생성자
	
	Ipad(){
		
	}
	Ipad(String owner){
		this.owner = owner;
	}
	
	int batteryNum() {
		return 80;
	}
	
	void showInfo() {
		System.out.println("Ipad 정보 출력 ===");
		System.out.println(owner + "님의 아이패드 입니다.");
		System.out.println("배터리 잔여량 : "+ batteryNum() );
	}
	
	void returnCheck() {
		
		System.out.println("returnCheck 1");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			
			if(i==5) {
				break; 
			}
		}
		
		System.out.println("returnCheck 2");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
	//메소드
	
}
