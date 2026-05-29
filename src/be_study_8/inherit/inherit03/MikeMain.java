package be_study_8.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		
		Mike m1 = new Mike();
		m1.type = "마이크";
		m1.volumeUp();
		m1.check();
		
		WirelessMike m2 = new WirelessMike();
		m2.type = "무선마이크";
		m2.check();
		m2.volumeUp();//재정의하면 재정의 우선, 재정의 없으면 그냥 상속받은 메소드 실행
		
		BluetoothMike m3 = new BluetoothMike();
		m3.type = "블루투스마이크";
		m3.isConnected = false;
		m3.battery = 50;
		
		System.out.println("---BluetoothMike---");
		m3.check();    //기본 메소드
		m3.volumeUp(); //재정의 메소드
		m3.volumeUp(3);//새로 만든 메소드
	}

}
