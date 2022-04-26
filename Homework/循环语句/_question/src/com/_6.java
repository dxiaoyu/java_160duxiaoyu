package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] agrs) {
		System.out.print("请输入一个数字:");
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
	}
}
