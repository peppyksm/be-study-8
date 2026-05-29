package be_study_8.inherit.inherit04;

import java.util.ArrayList;
import java.util.List;

import be_study_8.inherit.inherit03.BluetoothMike;
import be_study_8.inherit.inherit03.Mike;
import be_study_8.inherit.inherit03.WirelessMike;

public class Inherit04Main {

	public static void main(String[] args) {

		// 타입 변환
		// 메소드 재정의
		// 다형성

		int n = 10;
		double d = 10.5;
		double d2 = 50; // 자동형변환

		Mike m1 = new Mike();
		BluetoothMike bm1 = new BluetoothMike();
		WirelessMike wm1 = new WirelessMike();

		m1.volumeUp();
		bm1.volumeUp();
		wm1.volumeUp();

		// 부모타입 변수 = 자식타입 객체
		Mike m2 = bm1; // 생성된 객체 가능
		Mike m3 = wm1;

		Mike m4 = new BluetoothMike(); // 새 객체 생성도 가능
		Mike m5 = new WirelessMike();

//		BluetoothMike bm2 = new Mike();			자식에게 부모x 
//		BluetoothMike bm2 = new WirelessMike(); 부모 -> 자식 or 부모 ->자식의자식 아니면 안됨

		m4.volumeUp(); // 자식에서 재정의된 메소드로 실행
		m5.volumeUp();
		m5.check();

		// 다형성
		int a = 10;
		int b = 20;
		int c = 30;
		int[] intArr = { 10, 20, 30 }; // 한번에 관리, 같은 타입

		BluetoothMike[] bAr = { bm1, new BluetoothMike(), new BluetoothMike() };

		
		// 자식 메소드를 Mike 타입에 담을 수 있음
		Mike[] arr = { m1, bm1, wm1 }; 
		Mike[] arr2 = { new Mike(), new BluetoothMike(), new WirelessMike() };
		Mike[] arr3 = new Mike[3];
		arr3[0] = new Mike();
		arr3[1] = new BluetoothMike();
		arr3[2] = new WirelessMike();
		
		// ArrayList에도 자식 메소드 담기 가능
		ArrayList<Mike> mList = new ArrayList<Mike>();
		mList.add(new Mike());
		mList.add(new BluetoothMike());
		mList.add(new WirelessMike());
		
		for(Mike m : mList) {//재정의 된 메소드가 자동으로 실행 => 다형성
			m.volumeUp();     
		}
		
		
		
		List<Mike> mList2 = new ArrayList<Mike>();
		
		//타입변수 기준 사용법을 알고있는 메소드만 호출 가능
		//bm1.connect();
		//m4.connect();
	}

}
