package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] agrs) {//ps：因为菱形只有单数行，所以这里输出2x-1行的菱形。
		System.out.print("请输入一个自然数:");
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		for(int i=0;i<x;i++) {//打印上x行
			for(int n=x-1-i;n>0;n--) {System.out.print(" ");}
			for(int m=0;m<2*i+1;m++) {System.out.print("*");}
			System.out.println("");
		}
		for(int i=0;i<x-1;i++) {//打印打下x-1行
			for(int n=0;n<i+1;n++) {System.out.print(" ");}
			for(int m=0;m<2*(x-2-i)+1;m++) {System.out.print("*");}
			System.out.println("");
		}
	}
}
