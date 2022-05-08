package point;
/*
 *author @杜小雨
 *
 *2022年5月8日-下午1:04:56
 */

public class Piont {
	double abscissa;
	double ordinate;
	
	public Piont(double abscissa,double ordinate) {
		this.abscissa=abscissa;
		this.ordinate=ordinate;
		System.out.println("横坐标为:"+abscissa);
		System.out.println("纵坐标为:"+ordinate);
	}
	
	public void printPoint() {
			System.out.println("该点坐标为:"+"("+this.abscissa+","+this.ordinate+")");
	}
}
