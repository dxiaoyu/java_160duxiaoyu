package _question;

import java.util.Scanner;

public class _3 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("请输入一个数：");
		a=input.nextInt();
		if(0<a&&a<6) System.out.println("为工作日");
		else System.out.println("为周末");
	}
}
