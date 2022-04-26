package com;

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double a=input.nextDouble();
		System.out.print("请输入第二个数字：");
		double b=input.nextDouble();
		System.out.print("请输入第三个数字：");
		double c=input.nextDouble();
        double e;
        e=(a<b?a:b);
        e=(e<c?e:c);
        System.out.println("最小的数字为"+e);
}
}
