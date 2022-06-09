package TeamProject;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Member m = new Member();
		int num;
		while(true) {
			System.out.println("1. 회원관리 이동");
			System.out.println("2. 이벤트 관리 이동:");
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
