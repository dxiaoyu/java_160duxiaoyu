package com;
import java.util.Scanner;
public class _2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int type,num;
		System.out.println("请输入你想要的花色：1.红桃 2.方块 3.黑桃 4.梅花");
		type = input.nextInt();
		System.out.print("请输入你想要的点数：");
		num = input.nextInt();
		System.out.print("你输入的牌为：");
		switch(type) {
		case 1 : System.out.print("红桃");break;
		case 2 : System.out.print("方块");break;
		case 3 : System.out.print("黑桃");break;
		case 4 : System.out.print("梅花");break;
		default : System.out.print("错误输入，请重新输入。");break;
		}
		switch(num) {
		case 10 : System.out.println("J");break;
		case 11 : System.out.println("K");break;
		case 12 : System.out.println("L");break;
		default : System.out.print(num);break;
		}
	}
}
