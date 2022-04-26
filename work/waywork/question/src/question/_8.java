package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:01:39
 */
import java.util.Scanner;
public class _8 {
	public void add(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print("1+2+...+"+n+"的之为："+sum);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_8 theWay=new _8();
		System.out.print("请输入一个数字：");
		int a=input.nextInt();
		theWay.add(a);
	}


}
