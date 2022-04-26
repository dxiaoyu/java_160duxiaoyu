package question;

import java.util.Scanner;

/*
*@author 杜小雨
*
*2022年4月13日-下午6:39:49
*/

public class _3 {
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		while(sum<100) {
			System.out.print("请输入1~10以内的数字:");
			int num=input.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);

 }
}
