package be_study_8.cls.cls07.pack1;
import be_study_8.cls.cls07.pack2.*;   //pack2 패키지 임포트

import be_study_8.cls.cls07.pack2.Cup; 
//이렇게 임포트하면 같은 파일명(Cup)은 모두  pack2의 Cup으로 인식

import java.util.Scanner;

public class CupMain {

	public static void main(String[] args) {
		
		Cup c1 = new Cup();
		c1.method();
		
		be_study_8.cls.cls07.pack1.Cup c2 = new be_study_8.cls.cls07.pack1.Cup();
		c2.method();
		
		Cup c3 = new Cup();
		be_study_8.cls.cls07.pack1.Cup c4 = new be_study_8.cls.cls07.pack1.Cup();
		c4.type = "유리컵";
		
		//클래스명의 풀네임은 패키지경로 + 클래스명
		
		Scanner scanner = new Scanner(System.in);
		
		be_study_8.cls.cls07.pack2.Cup c5 = new be_study_8.cls.cls07.pack2.Cup();
		c5.method();
		c5.type = "플라스틱";
	}

}
