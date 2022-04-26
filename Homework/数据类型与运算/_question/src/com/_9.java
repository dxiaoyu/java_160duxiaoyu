package com;
import java.util.Scanner;
public class _9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int a=input.nextInt();
		boolean b;
	    b=(a%2==0)?	true:false;
	    if(b==false) {System.out.print(a+"为奇数");}
	    else {System.out.print(a+"不为奇数");}
	}
}
