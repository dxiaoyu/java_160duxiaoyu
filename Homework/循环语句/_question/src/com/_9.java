package com;
import java.util.Scanner;
public class _9 {
	public static void main(String[] agrs) {
		System.out.print("������һ������:");
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print((int)Math.pow(i,2)+" ");
		}
	}
}
