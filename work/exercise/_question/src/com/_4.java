package com;
public class _4 {
	public static void main(String[] agrs) {
		for(int i=0;i<5;i++) {//打印上5行
			for(int n=4-i;n>0;n--) {System.out.print(" ");}
			for(int m=0;m<2*i+1;m++) {System.out.print("*");}
			System.out.println("");
		}
		for(int i=0;i<4;i++) {//打印下4行
			for(int n=0;n<i+1;n++) {System.out.print(" ");}
			for(int m=0;m<2*(3-i)+1;m++) {System.out.print("*");}
			System.out.println("");
		}
	}
}
