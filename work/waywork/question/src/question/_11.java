package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����11:03:15
 */
import java.util.Scanner;
public class _11 {
	public int getCode(char str) {
		int a=(int)(str);
		return a;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_11 theWay=new _11();
		System.out.print("������һ���ַ���");
		char str=input.next().charAt(0);
		int c =theWay.getCode(str);
		System.out.print(str+"��acs��֮Ϊ:"+c);
	}

}
