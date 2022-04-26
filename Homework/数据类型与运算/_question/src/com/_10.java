package com;

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double a=input.nextDouble();
		System.out.print("请输入第二个数字：");
		double b=input.nextDouble();
		boolean c;
	    c=(a>b)?true:false;
	    if(c==true) {System.out.print(a);}
	    else {System.out.print(b);}
}
}
