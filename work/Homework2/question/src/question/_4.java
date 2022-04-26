package question;
 
/*
*@author 杜小雨
*
*2022年4月13日-下午6:46:12
*/

public class _4 {
	public static void main(String[] agrs) {
		char c1='a';
		System.out.print(c1);
		char c3=c1;
		char c2='A';
		for(int i=0;i<25;i++) {
			c3=(char)(c3+1);
			System.out.print(" "+c3);
		}
		System.out.println("");
		c3=c2;
		System.out.print(c3);
		for(int i=0;i<25;i++) {
			c3=(char)(c3+1);
			System.out.print(" "+c3);
		}

	}
}
