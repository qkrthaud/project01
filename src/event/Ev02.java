package event;

import java.util.Scanner;

public class Ev02 implements EvList{

	public void monEv() {
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.print("이번 달 입력 : ");
			int a= input.nextInt();
			if(a<=1 && a<4) {
				System.out.println(A);
				break;
			}
			else if(a<=4&&a<7) {
				System.out.println(B);
				break;
			}
			else if(a<=7&&a<10) {
				System.out.println(C);
				break;
			}
			else if(a<=10&&a<12) {
				System.out.println(D);
				break;
			}
			else {
				System.out.println("잘못된 입력");
			}
		}

	}

}
