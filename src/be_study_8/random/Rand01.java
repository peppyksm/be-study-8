package be_study_8.random;

import java.util.Random;

public class Rand01 {

	public static void main(String[] args) {
		
		//Math.random()
		//(int)(Math.random()*갯수(범위)) + 시작숫자
		
		//1~10
		//(int)(Math.random()*10) + 1;
		
		//35~45
		//(int)(Math.random()*11) + 35;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(Math.random());
		}
		for(int i = 1; i <= 10; i++) {//1~50
		    System.out.println((int)(Math.random() * 50) + 1);
		}
		for(int i = 1; i <= 10; i++) {//101~200
		    System.out.println((int)(Math.random() * 100) + 101);
		}
		for(int i = 1; i <= 10; i++) {//30~50
		    System.out.println((int)(Math.random() * 21) + 30);
		}
		
		
		Random random = new Random();
		
		System.out.println(random.nextInt(10));   //0 <= 값 < 10
		System.out.println(random.nextInt(10) + 1);    //1~10
		System.out.println(random.nextInt(6) + 10);    //10~15
		random.nextInt(10, 16); //10~15

	}

}
