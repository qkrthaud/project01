package event;

import java.util.Scanner;

public class Ev01 extends Ev03{
	public Ev01(){
		Scanner input=new Scanner(System.in);
		Ev03 e = new Ev03();
		System.out.println("1. �� ���� �̺�Ʈ ����");
		System.out.println("2. ���� �̺�Ʈ ����");
		System.out.print("���� : ");
		int cho=input.nextInt();
		if(cho==1) {
			e.monEv();
		}else if(cho==2) {
			e.print();
		}else {
			System.out.println("�߸��� �Է�");
		}
	}

}
