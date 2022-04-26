package com;
public class _5 {
	public static void main(String[] agrs) {
		for(int n=4;n>0;n--) {System.out.print(" ");}//打印上5行
		System.out.print("*");
		System.out.println("");
		for(int i=0;i<4;i++) {
			for(int n=3-i;n>0;n--) {System.out.print(" ");}
			System.out.print("*");
			for(int m=0;m<2*i+1;m++) {System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
		}
		for(int i=0;i<3;i++) {//打印下4行
			for(int n=0;n<i+1;n++) {System.out.print(" ");}
			System.out.print("*");
			for(int m=0;m<2*(3-i)-1;m++) {System.out.print(" ");}
			System.out.print("*");
			System.out.println("");
		}
		for(int n=4;n>0;n--) {System.out.print(" ");}
		System.out.print("*");
	}
}
