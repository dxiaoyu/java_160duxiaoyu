package com;
import java.util.Scanner;
public class _4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的分数：");
		double grade = input.nextDouble();
		int a = (int)(grade/10);
		switch(a) {
		case 10:
		case 9 :System.out.print("优秀");break;
		case 8 :System.out.print("良好");break;
		case 7 :System.out.print("中等");break;
		case 6 :System.out.print("及格");break;
		default:System.out.print("不及格");break;
		}
	}
}
