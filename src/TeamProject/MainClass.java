package TeamProject;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Member m = new Member();
		int num;
		while(true) {
			System.out.println("1. ȸ������ �̵�");
			System.out.println("2. �̺�Ʈ ���� �̵�:");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				m.memberInput();
				m.memberToTal();
				break;
			case 2: break;
			case 3: break;
			}
			
		}
	}
}	
