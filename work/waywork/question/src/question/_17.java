package question;

/*
 *@author 杜小雨
 *
 *2022年4月20日-上午11:04:03
 */
import java.util.Scanner;
public class _17 {
	public double getprint(int n) {
		double sum=0;
		if (n % 2 == 0) {
			for (int i = 2; i < n; i=i+2) {
				System.out.print("1/" + i + "+");
				sum+=1.0/i;
			}
			System.out.print("1/" + n+"的和为:");
			sum+=1.0/n;
		}else {
			for(int i=3;i<n;i=i+2) {
				System.out.print("1/" + i + "+");
				sum+=1.0/i;
			}
			sum+=1.0/n;
			System.out.print("1/" + n+"的和为:");
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		_17 theWay = new _17();
		System.out.print("请输入一个数字：");
		int n = input.nextInt();
		double sum=theWay.getprint(n);
		System.out.print(sum);
	}


}
