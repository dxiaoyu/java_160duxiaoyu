
/*
 *author @杜小雨
 *
 *2022年5月4日-上午8:31:11
 */
import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		double[][] array = new double[10][6];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个同学的学号:");
			array[i][0] = input.nextDouble();
			System.out.print("请输入第" + (i + 1) + "个同学的语文成绩:");
			array[i][1] = input.nextDouble();
			System.out.print("请输入第" + (i + 1) + "个同学的数学成绩:");
			array[i][2] = input.nextDouble();
			System.out.print("请输入第" + (i + 1) + "个同学的外语成绩:");
			array[i][3] = input.nextDouble();
			array[i][4] = array[i][1] + array[i][2] + array[i][3];
			array[i][5] = array[i][4] / 3;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("学号:" + array[i][0]);
			System.out.println("语文成绩:" + array[i][1]);
			System.out.println("数学成绩:" + array[i][2]);
			System.out.println("外语成绩:" + array[i][3]);
			System.out.println("总分:" + array[i][4]);
			System.out.println("平均分:" + array[i][5]);
			System.out.println("");
		}
		int[] rank= {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++) {
				int a=0;
				if(array[rank[i]][4]<array[rank[j]][4]) {a=rank[i];rank[i]=rank[j];rank[j]=a;}
			}
		}
		for(int n:rank) {
			if(array[n][4]==array[0][4]) {
				System.out.println("最高分");
				System.out.println("学号:" + array[rank[0]][0] );
				System.out.println("语文成绩:" + array[rank[0]][1]);
				System.out.println("数学成绩:" + array[rank[0]][2]);
				System.out.println("外语成绩:" + array[rank[0]][3]);
				System.out.println("总分:" + array[rank[0]][4]);
				System.out.println("平均分:" + array[rank[0]][5]);
			}
		}
	}
}