package _question;

import java.util.Scanner;

public class _7 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a,b,c,d;
		a=b=c=d=0;
		System.out.print("������һ����λ����");
		a=input.nextInt();
		b=a/100;
		c=a/10-b*10;
		d=a-b*100-c*10;
		if(b*b*b+c*c*c+d*d*d==a) System.out.println(a+"Ϊˮ�ɻ���");
		else System.out.println(a+"��Ϊˮ�ɻ���");
	}
}
