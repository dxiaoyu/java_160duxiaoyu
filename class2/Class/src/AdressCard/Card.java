package AdressCard;
/*
 *@author 杜小雨
 *
 *2022年5月15日-下午9:17:08
 */

public class Card {
	
    String name;
    private String phoneNumber;
    private String adress;
    private String QQNumber;
	public String getName() {
		return name;
	}
	
	public Card() {
		System.out.println("我是无参构造函数");
	}
	
	public Card(String name) {
		System.out.println("我是带参构造函数");
		this.name=name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
			
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getQQNumber() {
		return QQNumber;
	}
	
	public void setQQNumber(String qQNumber) {
		QQNumber = qQNumber;
	}
	
	public void printAdressCard(String name) {
		System.out.println("姓名:"+this.name);
		System.out.println("电话:"+this.phoneNumber);
		System.out.println("地址:"+this.adress);
		System.out.println("QQ:"+this.QQNumber);
	}
	
}
