package AdressCard;
/*
 *@author 杜小雨
 *
 *2022年5月15日-下午9:25:13
 */
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Card one=new Card();
		Scanner input=new Scanner(System.in);
		one.name="小明";
		System.out.print("请输入电话:");
		String phoneNumber=input.next();
		one.setPhoneNumber(phoneNumber);
		System.out.print("请输入地址:");
		String adress=input.next();
		one.setAdress(adress);
		System.out.print("请输入QQ号:");
		String QQNumber=input.next();
		one.setQQNumber(QQNumber);
		System.out.println("姓名:"+one.name);
		System.out.println("电话:"+one.getPhoneNumber());
		System.out.println("地址:"+one.getAdress());
		System.out.println("QQ:"+one.getQQNumber());
	}

}
