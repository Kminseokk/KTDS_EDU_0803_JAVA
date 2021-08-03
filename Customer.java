package java08_ex;

public class Customer {
	protected int customerID; //고객아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급
	int bonusPoint; //보너스포인트
	double bonusRatio; // 적립 비율
	int price;
	
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER"; //기본 등급
		bonusRatio = 0.01; //포인트 기본적립비율
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}aa
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //포인트 계산
		this.price = price;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println (customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."); 
	}
	
	public void showStatement() {
		System.out.println (customerName + " 님의 등급은 " + customerGrade + "이며, 지불해야 하는 금액은 " + price + "입니다."); 
	}

}

