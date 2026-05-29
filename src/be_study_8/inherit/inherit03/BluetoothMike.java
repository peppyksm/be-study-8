package be_study_8.inherit.inherit03;

public class BluetoothMike extends Mike{
	//블루투스 마이크
	boolean isConnected;
	int battery;
	
	//메소드 확장
	
	public void connect() {
		
	}
	
	//오버라이딩
	public void volumeUp() {
		System.out.println("BluetoothMike volumeUp() 재정의");
	}
	
	public void volumeUp(int v) {
		System.out.println(v + "만큼 볼륨 증가 public void volumeUp(int v)");
		//개별적 추가선언 확장, 메소드 오버로딩
	}
	
	//부모클래스 final 메소드 = 재정의 불가
//	public final void noMethod() {
//	}
	
}
