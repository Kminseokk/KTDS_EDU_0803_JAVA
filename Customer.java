package java08_ex;

public class Customer {
	protected int customerID; //�����̵�
	protected String customerName; //���̸�
	protected String customerGrade; //�����
	int bonusPoint; //���ʽ�����Ʈ
	double bonusRatio; // ���� ����
	int price;
	
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER"; //�⺻ ���
		bonusRatio = 0.01; //����Ʈ �⺻��������
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}aa
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //����Ʈ ���
		this.price = price;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println (customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�."); 
	}
	
	public void showStatement() {
		System.out.println (customerName + " ���� ����� " + customerGrade + "�̸�, �����ؾ� �ϴ� �ݾ��� " + price + "�Դϴ�."); 
	}

}

