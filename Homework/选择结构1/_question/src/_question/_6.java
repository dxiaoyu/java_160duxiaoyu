package _question;
import java.util.Scanner;
public class _6 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int year=input.nextInt();
		if(year%4!=0) System.out.println(year+"不是闰年");
		else if(year%100!=0) System.out.println(year+"是闰年");
		     else if(year%400==0)System.out.println(year+"是闰年");
		          else System.out.println(year+"不是闰年");
	}
}
