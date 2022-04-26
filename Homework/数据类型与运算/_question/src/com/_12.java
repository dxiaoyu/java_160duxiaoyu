package com;

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double a=input.nextDouble();
		System.out.print("请输入第二个数字：");
		double b=input.nextDouble();
		System.out.println("第一个数字为"+a+"第二个数字为"+b);
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("交换后，第一个数字为"+a+"第二个数字为"+b);
}
}
