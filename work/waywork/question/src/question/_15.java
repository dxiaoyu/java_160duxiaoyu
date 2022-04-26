package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:03:46
 */
import java.util.Scanner;
public class _15 {
	public void getPrint(int n) {
		for(int i=2;i<n;i++) {
			System.out.print("1/"+i+"+");
		}
		System.out.print("1/"+n);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_15 theWay=new _15();
		System.out.print("请输入一个数字：");
		int n=input.nextInt();
		theWay.getPrint(n);
	}


}
