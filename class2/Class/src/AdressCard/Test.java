package AdressCard;
/*
 *@author ��С��
 *
 *2022��5��15��-����9:25:13
 */
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Card one=new Card();
		Scanner input=new Scanner(System.in);
		one.name="С��";
		System.out.print("������绰:");
		String phoneNumber=input.next();
		one.setPhoneNumber(phoneNumber);
		System.out.print("�������ַ:");
		String adress=input.next();
		one.setAdress(adress);
		System.out.print("������QQ��:");
		String QQNumber=input.next();
		one.setQQNumber(QQNumber);
		System.out.println("����:"+one.name);
		System.out.println("�绰:"+one.getPhoneNumber());
		System.out.println("��ַ:"+one.getAdress());
		System.out.println("QQ:"+one.getQQNumber());
	}

}
