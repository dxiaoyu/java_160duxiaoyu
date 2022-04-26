package com;
import java.util.Scanner;
public class _synthesize {
	public static void main(String[] agrs) {
		int n=0;
		System.out.println("请选择你的游戏模式：1.游玩20次 2.游玩至输20次");
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		int win=0;
		int lose=0;
		int dogfall=0;
		int sum=0;
		int fault=0;
		if(n==1) {
			while(sum<=20) {
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
				default : System.out.println("错误输入，请重新输入");fault=fault+1;break;
				}
				int result=player-computer;
				switch(result) {
				case 0 : System.out.println("平局");dogfall=dogfall+1;break;
				case -1:
				case 2 :System.out.println("玩家胜出！");win=win+1;break;
				default :System.out.println("电脑胜出！");lose=lose+1;break;
				}
				sum=sum+1;
			}
		}else {
			while(lose<=20) {
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
				case 0 : System.out.println("平局");dogfall=dogfall+1;break;
				case -1:
				case 2 :System.out.println("玩家胜出！");win=win+1;break;
				default :System.out.println("电脑胜出！");lose=lose+1;break;
				}
				sum=sum+1;
			}
		}
		int grade =win*10;
		System.out.println("游戏结束，你获得了"+grade+"分");
		System.out.println("你一共进行了"+sum+"局游戏");
		System.out.println("获胜了"+win+"局游戏");
		System.out.println("平局了"+dogfall+"局游戏");
		System.out.println("失败了"+lose+"局游戏");
		System.out.println("错误输入"+fault+"局游戏");
	}
}
