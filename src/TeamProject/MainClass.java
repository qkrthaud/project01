package TeamProject;

import java.util.Scanner;
import event.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. ȸ������ �̵�");
			System.out.println("2. �̺�Ʈ ���� �̵�:");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1: break;
			case 2: 
				Ev01 e= new Ev01();
				break;
			case 3: break;
			}
			
		}
	}
}	
