package java08_ex;

public class People {

	  public String peopleName; // �л� �̸�
	  public int grade; // �г�
	  public int money; // �л��� ������ �ִ� ��

	  public People(String peopleName, int money){ // �̸��� �� �ʱ�ȭ�ϱ�
		  this.peopleName = peopleName;
		  this.money = money;
	  }
	  
	  public void takeCafeAme(Cafe cafe) {
		  cafe.take(4000, "ame");
		  this.money -= 4000;
	  }
	  
	  public void takeCafeLatte(Cafe cafe) {
		  cafe.take(4500, "latte");
		  this.money -= 4500;
	  }
	  
	  public void showInfo() {
		  System.out.println(peopleName + "���� ���� ���� " + money + "�Դϴ�.");
	  }
	  
}
