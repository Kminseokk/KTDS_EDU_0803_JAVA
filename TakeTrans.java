package java08_ex;

public class TakeTrans {
	public static void main(String[] args) {
		People peopleVicky = new People("Vicky", 50000);
		People peopleSpencer = new People("Spencer", 50000);
		
		Cafe cafestar = new Cafe("���ٹ�", "ame");
		peopleVicky.takeCafeAme(cafestar); // ��Ű�� ���ٹ濡 ��
		peopleVicky.showInfo(); //��Ű ���
		cafestar.showInfo(); // ���ٹ� ���
		
		Cafe cafekong = new Cafe("��ٹ�", "latte");
		peopleSpencer.takeCafeLatte(cafekong); // ���Ҽ� ��ٹ� ��
		peopleSpencer.showInfo(); //���Ҽ� ���
		cafekong.showInfo(); //��ٹ��������
	}
}
