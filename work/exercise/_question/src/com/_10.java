package com;
import java.util.Scanner;
public class _10 {
	public static void main(String[] agrs) {
		System.out.print("请输入一个整数:");
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		int n=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				n=n+1;
				System.out.print(x+"不是素数。");
				break;
			}
		}
		if(n==0) System.out.print(x+"是素数。");
	}
}
