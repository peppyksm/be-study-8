package be_study_8.cls.cls04;


public class IpadMain {

	public static void main(String[] args) {
		
		Ipad ip1 = new Ipad();
		ip1.owner = "김승민";
		ip1.showInfo();
		
		Ipad ip2 = new Ipad();
		ip2.owner = "김승투";
		ip2.showInfo();
		
		Ipad ip3 = new Ipad("김대리");
		System.out.println(ip3.owner);
		System.out.println(ip3.batteryNum());
		ip3.showInfo();
		
		Ipad ip4 = new Ipad();
		ip4.showInfo();//owner 값 없음
		ip4.owner="김회장"; //owner 값 초기화
		ip4.showInfo(); //owner 값 출력
		
		ip1.returnCheck();
	}

}
