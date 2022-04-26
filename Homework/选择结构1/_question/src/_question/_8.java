package _question;

import java.util.Scanner;

public class _8 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a,b,c;
		System.out.println("请输入三个数eg：1 2 3");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		int d=0;
		if(a>b) d=b;
		else  d=a;
		if(d>c)d=c;
		System.out.println("最小的数为"+d);
	}
}
