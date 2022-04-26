package com;
import java.util.Scanner;
public class _1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int player,computer;
		System.out.println("请输入你想出的：1.石头 2.剪刀 3.布");
		player=input.nextInt();
		System.out.print("玩家出的是:");
		switch (player) {
		case 1 : System.out.println("石头");break;
		case 2 : System.out.println("剪刀");break;
		case 3 : System.out.println("布");break;
		default : System.out.println("错误输入，请重新输入");break;
		}
		computer=(int)(Math.random()*3)+1;
		System.out.print("电脑出的是:");
		switch (computer) {
		case 1 : System.out.println("石头");break;
		case 2 : System.out.println("剪刀");break;
		case 3 : System.out.println("布");break;
		default : System.out.println("错误输入，请重新输入");break;
		}
		int result=player-computer;
		switch(result) {
		case 0 : System.out.println("平局");break;
		case -1:
		case 2 :System.out.println("玩家胜出！");break;
		default :System.out.println("电脑胜出！");break;
		}
	}
}
