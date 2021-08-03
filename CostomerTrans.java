package java08_ex;

public class CostomerTrans {

	public static void main(String[] args) {
		Customer Packtofhdl =  new Customer("박새로이");
		Packtofhdl.calcPrice(10000);
		Packtofhdl.showCustomerInfo();
		Packtofhdl.showStatement();
		
		VIPCustomer Yoontpfl = new VIPCustomer("윤세리");
		Yoontpfl.calcPrice(10000);
		Yoontpfl.showCustomerInfo();
		Yoontpfl.showStatement();
	}

}
