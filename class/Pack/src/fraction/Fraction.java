package fraction;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午12:55:12
 */

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(int numerator,int denominator) {
		this.denominator=denominator;
		this.numerator=numerator;
		System.out.println("分子:"+numerator);
		System.out.println("分母:"+denominator);
	}
	
	public void printFraction() {
		System.out.println("分数为:"+this.numerator+"/"+this.denominator);
	}
}
