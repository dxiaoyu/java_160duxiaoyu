package _question;

import java.util.Scanner;

public class _5 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int grade;
		System.out.print("������һ������");
		grade=input.nextInt();
		grade=grade/10;
		if(grade<=100&&grade>=0) {
	        switch(grade) {
	        case 10:
	        case 9 : System.out.println("��");break;
	        case 8 : System.out.println("��");break;
	        case 7 : System.out.println("��");break;
	        case 6 : System.out.println("����");break;
	        default: System.out.println("������");break;
	        }
		}
		else System.out.println("��������");
	}
}
