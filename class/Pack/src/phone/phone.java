package phone;
/*
 *author @��С��
 *
 *2022��5��8��-����12:44:22
 */

import java.util.Scanner;

public class phone {
	String brand;
	String color;
	int price;

	public phone(String brand,String color,int price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("Ʒ��:"+brand);
		System.out.println("��ɫ:"+color);
		System.out.println("�۸�:"+price);
	}

	public void ringUp() {
		System.out.println("�ֻ��ܴ�绰");
	}

	public void sendMessage() {
		System.out.println("�ֻ��ܷ�����");
	}

}
