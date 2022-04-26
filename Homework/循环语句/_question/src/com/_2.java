package com;
import java.util.Scanner;
public class _2 {
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int n = input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.print("结果为"+sum);
	}
}
