package java08_ex;

public class CostomerTrans {

	public static void main(String[] args) {
		Customer Packtofhdl =  new Customer("�ڻ�����");
		Packtofhdl.calcPrice(10000);
		Packtofhdl.showCustomerInfo();
		Packtofhdl.showStatement();
		
		VIPCustomer Yoontpfl = new VIPCustomer("������");
		Yoontpfl.calcPrice(10000);
		Yoontpfl.showCustomerInfo();
		Yoontpfl.showStatement();
	}

}
