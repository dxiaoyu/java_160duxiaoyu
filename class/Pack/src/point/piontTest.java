package point;
/*
 *author @��С��
 *
 *2022��5��8��-����1:12:12
 */

import java.util.Scanner;

public class piontTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������ĺ�������:");
		int x=input.nextInt();
		int y=input.nextInt();
		Piont one=new Piont(x,y);
		one.printPoint();
	}

}
