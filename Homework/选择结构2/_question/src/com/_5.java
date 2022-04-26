package com;

public class _5 {
	public static void main(String[] agrs) {
		int chess = (int)(Math.random()*3);
		switch(chess) {
		case 0 :System.out.println("+");break;
		case 1 :System.out.println("*");break;
		case 2 :System.out.println("0");break;
		}
	}
}
