package _question;

import java.util.Scanner;

public class _2 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("������һ������");
		a=input.nextInt();
		if(a%2==1) System.out.println(a+"Ϊ����");
		else if(a!=0) System.out.println(a+"Ϊż��");
		     else System.out.println(a+"�Ȳ�Ϊ������Ҳ��Ϊż��");
	}
}
