package _question;

import java.util.Scanner;

public class _3 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("������һ������");
		a=input.nextInt();
		if(0<a&&a<6) System.out.println("Ϊ������");
		else System.out.println("Ϊ��ĩ");
	}
}
