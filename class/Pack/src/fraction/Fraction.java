package fraction;
/*
 *author @��С��
 *
 *2022��5��8��-����12:55:12
 */

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(int numerator,int denominator) {
		this.denominator=denominator;
		this.numerator=numerator;
		System.out.println("����:"+numerator);
		System.out.println("��ĸ:"+denominator);
	}
	
	public void printFraction() {
		System.out.println("����Ϊ:"+this.numerator+"/"+this.denominator);
	}
}
