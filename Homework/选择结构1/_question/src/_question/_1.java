package _question;
import java.util.Scanner;
public class _1 {
	public static void main(String[] agrs) {
		Scanner input =new Scanner(System.in);
		int a,b;
		System.out.println("������������eg��1 2");
		a=input.nextInt();
		b=input.nextInt();
		if(a>b) System.out.println(a+"��");
		else  System.out.println(b+"��");
	}
}
