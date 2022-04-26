package question;
 
/*
*@author 杜小雨
*
*2022年4月13日-下午7:53:48
*/

public class _7 {
	public static void main(String[] agrs) {
		int num1=1,num2=1,num3=0;
		System.out.print("斐波那契数列的前100位为：1 1");
		for(int i=0;i<100;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
		}
	}
}
