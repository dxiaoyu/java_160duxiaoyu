package question;
 
/*
*@author ��С��
*
*2022��4��13��-����6:06:30
*/
import java.util.Scanner;
public class _1 {
	public static void main(String[] agrs) {
		System.out.print("������һ����λ��:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int a,b,c,d;
		a=b=c=d=0;
		a=num/1000;
		b=num/100-a*10;
		c=num/10-a*100-b*10;
		d=num-a*1000-b*100-c*10;
		num=d*1000+c*100+b*10+a;
		System.out.println(num);
	}
}
