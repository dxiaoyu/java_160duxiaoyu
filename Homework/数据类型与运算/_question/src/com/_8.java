package com;
import java.util.Scanner;
public class _8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		double r=input.nextDouble();
		double s,c;
		s=3.14*r*r;
		c=2*3.14*r;
		System.out.println("圆的周长为"+c);
		System.out.println("圆的面积为"+s);
	}
}