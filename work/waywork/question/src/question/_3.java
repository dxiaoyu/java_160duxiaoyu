package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午10:59:01
 */
import java.util.Scanner;
public class _3 {
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public static void main(String[] args) {
		System.out.print("请输入两个数字:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        _3 theWay=new _3();
        int c=theWay.sub(a,b);
        System.out.print(c);
	}

}
