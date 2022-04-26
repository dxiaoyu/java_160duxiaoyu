package question;

import java.util.Scanner;

/*
*@author 杜小雨
*
*2022年4月13日-下午6:36:30
*/

public class _2 {
	public static void main(String[] agrs) {
		System.out.print("请输入十个数字数字:");
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++) {
			int num=input.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
