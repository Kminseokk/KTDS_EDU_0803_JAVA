package java08_ex;

public class TakeTrans {
	public static void main(String[] args) {
		People peopleVicky = new People("Vicky", 50000);
		People peopleSpencer = new People("Spencer", 50000);
		
		Cafe cafestar = new Cafe("별다방", "ame");
		peopleVicky.takeCafeAme(cafestar); // 비키가 별다방에 감
		peopleVicky.showInfo(); //비키 출력
		cafestar.showInfo(); // 별다방 출력
		
		Cafe cafekong = new Cafe("콩다방", "latte");
		peopleSpencer.takeCafeLatte(cafekong); // 스팬서 콩다방 감
		peopleSpencer.showInfo(); //스팬서 출력
		cafekong.showInfo(); //콩다방정보출력
	}
}
