package _question;
import java.util.Scanner;
public class _6 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		System.out.print("������һ����ݣ�");
		int year=input.nextInt();
		if(year%4!=0) System.out.println(year+"��������");
		else if(year%100!=0) System.out.println(year+"������");
		     else if(year%400==0)System.out.println(year+"������");
		          else System.out.println(year+"��������");
	}
}
