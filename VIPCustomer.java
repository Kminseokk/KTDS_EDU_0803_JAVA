package java08_ex;


public class VIPCustomer extends Customer {
	double saleRatio; //할인율
	
	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP"; //고객 등급 VIP
		bonusRatio = 0.05; //VIP 포인트 적립비율
		saleRatio = 0.1; //할인율 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //포인트 계산
		this.price = price - (int)(price * saleRatio); //할인율 적용
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println (customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."); 
	}
	
	public void showStatement() {
		System.out.println (customerName + " 님의 등급은 " + customerGrade + "이며, 지불해야 하는 금액은 " + price + "입니다."); 
	}
}

