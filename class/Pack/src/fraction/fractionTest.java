package fraction;
/*
 *author @��С��
 *
 *2022��5��8��-����1:00:50
 */

import java.util.Scanner;

public class fractionTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ�������ķ��Ӻͷ�ĸ:");
		int numerator=input.nextInt();
		int denominator=input.nextInt();
		Fraction one=new Fraction(numerator,denominator);
		one.printFraction();
		
		System.out.println("����ڶ��������ķ��Ӻͷ�ĸ:");
		numerator=input.nextInt();
		denominator=input.nextInt();
		Fraction two=new Fraction(numerator,denominator);
		two.printFraction();
	}

}
