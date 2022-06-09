package event;

import java.util.Scanner;

public class Ev01 extends Ev03{
	public Ev01(){
		Scanner input=new Scanner(System.in);
		Ev03 e = new Ev03();
		System.out.println("1. 이 달의 이벤트 보기");
		System.out.println("2. 연간 이벤트 보기");
		System.out.print("선택 : ");
		int cho=input.nextInt();
		if(cho==1) {
			e.monEv();
		}else if(cho==2) {
			e.print();
		}else {
			System.out.println("잘못된 입력");
		}
	}

}
