package _question;

import java.util.Scanner;

public class _4 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("������һ������");
		a=input.nextInt();
        switch(a) {
        case 1 : System.out.println("����һ");break;
        case 2 : System.out.println("���ڶ�");break;
        case 3 : System.out.println("������");break;
        case 4 : System.out.println("������");break;
        case 5 : System.out.println("������");break;
        case 6 : System.out.println("������");break;
        case 7 : System.out.println("������");break;
        default: System.out.println("�������룬����������");break;
        }
	}
}
