package java08_ex;

public class Cafe {
	String CafeName; // ī���̸�
	String CafeMenu; // ī��޴�
	int money; // ī���� ����
		  
	public Cafe(String cafeName, String cafeMenu){ // 
		this.CafeName = cafeName;
		this.CafeMenu = cafeMenu;
	}
		    
	public void take(int money, String cafeMenu){ // ��
		this.CafeMenu = cafeMenu; // ī��޴�
		this.money += money;
	}
		    
	public void showInfo() { // 
		System.out.println("ī�� "+"\""+ CafeName +"\""+ "�� �޴��̸��� " + CafeMenu +"�̰�, ������ "
				+ money + "�Դϴ�.");
		System.out.println("************************************");
	}
}
