package be_study_8.cls.cls07.pack2;

public class Cup {
	//default 같은 패키지까지만 접근 가능
	
	public String type;
	
//	void method()  default라 외부패키지 접근 불가
	
	public void method(){  //public으로 수정해 외부패키지 접근 가능
		System.out.println("pack2.Cup");
	}
}
