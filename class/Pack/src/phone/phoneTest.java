package phone;
/*
 *author @��С��
 *
 *2022��5��8��-����12:38:25
 */

import java.util.Scanner;

public class phoneTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������ֻ���Ʒ��,��ɫ,�۸�:");
		String brand = input.next();
		String color = input.next();
		int price = input.nextInt();
		phone one = new phone(brand, color, price);
		one.sendMessage();
		one.ringUp();
	}
}
