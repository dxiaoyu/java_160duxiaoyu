package com;

import java.util.Scanner;

public class _7 {
	public static void main(String[] agrs) {//ps：因为菱形只有单数行，所以这里输出2x-1行的菱形。
		System.out.print("请输入一个自然数:");
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		for(int n=x-1;n>0;n--) {System.out.print(" ");}//打印上x行
		System.out.print("*");
		System.out.println("");
		for(int i=0;i<x-1;i++) {
			for(int n=x-2-i;n>0;n--) {System.out.print(" ");}
			System.out.print("*");
			for(int m=0;m<2*i+1;m++) {System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
		}
		for(int i=0;i<x-2;i++) {//打印打下x-1行
			for(int n=0;n<i+1;n++) {System.out.print(" ");}
			System.out.print("*");
			for(int m=0;m<2*(x-2-i)-1;m++) {System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
		}
		for(int n=x-1;n>0;n--) {System.out.print(" ");}
		System.out.print("*");
	}
}
