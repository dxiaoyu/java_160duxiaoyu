package fraction;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午1:00:50
 */

import java.util.Scanner;

public class fractionTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个分数的分子和分母:");
		int numerator=input.nextInt();
		int denominator=input.nextInt();
		Fraction one=new Fraction(numerator,denominator);
		one.printFraction();
		
		System.out.println("输入第二个分数的分子和分母:");
		numerator=input.nextInt();
		denominator=input.nextInt();
		Fraction two=new Fraction(numerator,denominator);
		two.printFraction();
	}

}
