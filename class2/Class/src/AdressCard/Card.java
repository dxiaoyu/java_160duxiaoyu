package AdressCard;
/*
 *@author ��С��
 *
 *2022��5��15��-����9:17:08
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
		System.out.println("�����޲ι��캯��");
	}
	
	public Card(String name) {
		System.out.println("���Ǵ��ι��캯��");
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
		System.out.println("����:"+this.name);
		System.out.println("�绰:"+this.phoneNumber);
		System.out.println("��ַ:"+this.adress);
		System.out.println("QQ:"+this.QQNumber);
	}
	
}
