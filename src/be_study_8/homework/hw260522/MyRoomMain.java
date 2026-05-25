package be_study_8.homework.hw260522;

public class MyRoomMain {

	public static void main(String[] args) {
		
		
		System.out.println("=====에어컨=====");
		AirConditioner a1 = new AirConditioner("LG","Whisen SQ06EA1WCS", "흰색");
		
		a1.info();
		a1.PowerOn();
		a1.setTemperature(21);
		a1.windPowerUp();
		a1.windPowerDown();
		a1.mode("파워냉방");
		a1.PowerOff();
		
		System.out.println();
		System.out.println("=====일렉기타=====");
		ElectricGuitar eg1 = new ElectricGuitar("fender", "하이브리드2 텔레캐스터", "플라밍고 핑크", 1727000, 22);
		
		eg1.info();
		eg1.cablePlugIn();
		eg1.tuning();
		eg1.pickupSelect(3);
		eg1.toneUp();
		eg1.toneDown();
		eg1.volumeUp(30);
		eg1.volumeDown(15);
		eg1.soundOutput();
		eg1.cablePlugOut();
		
		System.out.println();
		System.out.println("=====오디오인터페이스=====");
		AudioInterface ai1 = new AudioInterface("Focusrite", "Scarlett solo 3rd", "red");
		
		ai1.info();
		ai1.instrumentConnect();
		ai1.micConnect();
		ai1.directMonitor();
		ai1.soundInput();
		ai1.soundOutput();
		ai1.loopBack();
		ai1.instrumentDisconnect();
		ai1.micDisconnect();
		
		System.out.println();
		System.out.println("=====옷장=====");
		Closet c1 = new Closet(1600,2000,1000,30,40);
		
		c1.info();
		c1.open();
		c1.addClothes();
		c1.removeClothes();
		c1.dehumidification(20);
		
		System.out.println();
		System.out.println("=====창문=====");
		Window w1 = new Window(1600,1400,"내 방 북쪽");
		
		w1.info();
		w1.windowUnLock();
		w1.windowOpen();
		w1.windowClose();
		w1.windowLock();
	}

}
