package question;

/*
 *@author ��С��
 *
 *2022��4��20��-����10:59:01
 */
import java.util.Scanner;
public class _3 {
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public static void main(String[] args) {
		System.out.print("��������������:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        _3 theWay=new _3();
        int c=theWay.sub(a,b);
        System.out.print(c);
	}

}
