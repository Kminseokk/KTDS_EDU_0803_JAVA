package java08_ex;


public class VIPCustomer extends Customer {
	double saleRatio; //������
	
	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP"; //�� ��� VIP
		bonusRatio = 0.05; //VIP ����Ʈ ��������
		saleRatio = 0.1; //������ 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //����Ʈ ���
		this.price = price - (int)(price * saleRatio); //������ ����
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println (customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�."); 
	}
	
	public void showStatement() {
		System.out.println (customerName + " ���� ����� " + customerGrade + "�̸�, �����ؾ� �ϴ� �ݾ��� " + price + "�Դϴ�."); 
	}
}

