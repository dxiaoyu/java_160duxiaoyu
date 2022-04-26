package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:03:38
 */
import java.util.Scanner;
public class _14 {
	public double getSum(int n) {
		double sum=0;
		for(int i=2;i<=n;i++) {
			sum+=1.0/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		_14 theWay=new _14();
		System.out.print("请输入一个数字：");
		int n=input.nextInt();
		double sum=theWay.getSum(n);
		System.out.print("1/2+1/3+1/4+1/5+... + 1/"+n+"为："+sum);
	}


}
