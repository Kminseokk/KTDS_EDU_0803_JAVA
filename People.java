package java08_ex;

public class People {

	  public String peopleName; // 학생 이름
	  public int grade; // 학년
	  public int money; // 학생이 가지고 있는 돈

	  public People(String peopleName, int money){ // 이름과 돈 초기화하기
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
		  System.out.println(peopleName + "님의 남은 돈은 " + money + "입니다.");
	  }
	  
}
