package question;
 
/*
*@author ��С��
*
*2022��4��13��-����7:48:43
*/

public class _6 {
	public static void main(String[] agrs) {
		System.out.print("1~1000�ڴ���3�������У�");
		for(int i=3;i<=1000;i++) {
			int a,b,c,d;
			a=b=c=d=0;
			a=i/1000;
			b=i/100-a*10;
			c=i/10-a*100-b*10;
			d=i-a*1000-b*100-c*10;
			int e=a*b*c*d;
			if(a==3||b==3||c==3||d==3)System.out.print(" "+i);
		}
	}
}
