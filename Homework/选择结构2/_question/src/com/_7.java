package com;
import java.util.Scanner;
public class _7 {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入日期eg2022 3 29");
		int year = input.nextInt();
		int month = input.nextInt();
		int day =input.nextInt();
		int days= 0;
		switch(month) {
		case 1 : days=day;break;
		case 2 : days=day+31;break;
		case 3 : days=day+31+28;break;
		case 4 : days=day+31+28+31;break;
		case 5 : days=day+31+28+31+30;break;
		case 6 : days=day+31+28+31+30+31;break;
		case 7 : days=day+31+28+31+30+31+30;break;
		case 8 : days=day+31+28+31+30+31+30+31;break;
		case 9 : days=day+31+28+31+30+31+30+31+31;break;
		case 10: days=day+31+28+31+30+31+30+31+31+30;break;
		case 11: days=day+31+28+31+30+31+30+31+31+30+31;break;
		case 12: days=day+31+28+31+30+31+30+31+31+30+31+30;break;
		}
		if(year%4!=0) System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+days+"天");
		else if(year%100!=0) {
			days=days+1;
			System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+days+"天");
		}else if(year%400==0) {
			days=days+1;
			System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+days+"天");
		}else System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+days+"天");
	}
}
