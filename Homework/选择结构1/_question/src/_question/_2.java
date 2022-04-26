package _question;

import java.util.Scanner;

public class _2 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a;
		System.out.print("请输入一个数：");
		a=input.nextInt();
		if(a%2==1) System.out.println(a+"为奇数");
		else if(a!=0) System.out.println(a+"为偶数");
		     else System.out.println(a+"既不为奇数，也不为偶数");
	}
}
