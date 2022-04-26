package com;
import java.util.Scanner;
public class _6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入语文成绩");
		int Chinese=input.nextInt();
		System.out.print("请输入数学成绩");
		int Math=input.nextInt();
		System.out.print("请输入英语成绩");
		int English=input.nextInt();
		int sum;
		double average;
		sum=Chinese+Math+English;
		average=(Chinese+Math+English)/3.0;
		System.out.println("你的语文成绩为"+Chinese);
		System.out.println("你的数学成绩为"+Math);
		System.out.println("你的英语成绩为"+English);
		System.out.println("你的总成绩为"+sum);
		System.out.println("你的平均分为"+average);
	}
}
