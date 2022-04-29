package array;
/*
 *author @杜小雨
 *
 *2022年4月29日-下午6:39:32
 */
import java.util.Scanner;
public class _2 {

	public static void main(String[] args) {
		double[] grade=new double[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i < grade.length;i++) {
			System.out.print("请输入"+(i+1)+"个学生的成绩：");
			grade[i]=input.nextDouble();
		}
		for(double n:grade) {
			System.out.println("学生的成绩："+n);
		}
	}

}
