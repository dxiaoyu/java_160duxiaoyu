package _question;

import java.util.Scanner;

public class _9 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		double profit,principal,sum;
		profit=principal=sum=0;
		System.out.print("请输入利润：（单位/万元）");
		profit=input.nextDouble();
		if(profit<=1) principal=profit/0.1;
		else if(profit<=1.75)principal=10+(profit-1)/0.075;
	    else if(profit<=2.75)principal=20+(profit-1.75)/0.05;
	    else if(profit<=3.35)principal=40+(profit-2.75)/0.03;
	    else if(profit<=3.95)principal=60+(profit-3.35)/0.015;
	    else principal=100+(profit-3.95)/0.01;
		sum=(float)(profit+principal);
		System.out.print("应发奖金数为"+sum+"万元");
	}
}
