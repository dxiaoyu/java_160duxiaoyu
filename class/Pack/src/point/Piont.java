package point;
/*
 *author @��С��
 *
 *2022��5��8��-����1:04:56
 */

public class Piont {
	double abscissa;
	double ordinate;
	
	public Piont(double abscissa,double ordinate) {
		this.abscissa=abscissa;
		this.ordinate=ordinate;
		System.out.println("������Ϊ:"+abscissa);
		System.out.println("������Ϊ:"+ordinate);
	}
	
	public void printPoint() {
			System.out.println("�õ�����Ϊ:"+"("+this.abscissa+","+this.ordinate+")");
	}
}
