package java08_ex;

public class Cafe {
	String CafeName; // 카페이름
	String CafeMenu; // 카페메뉴
	int money; // 카페의 수입
		  
	public Cafe(String cafeName, String cafeMenu){ // 
		this.CafeName = cafeName;
		this.CafeMenu = cafeMenu;
	}
		    
	public void take(int money, String cafeMenu){ // 승
		this.CafeMenu = cafeMenu; // 카페메뉴
		this.money += money;
	}
		    
	public void showInfo() { // 
		System.out.println("카페 "+"\""+ CafeName +"\""+ "의 메뉴이름은 " + CafeMenu +"이고, 수입은 "
				+ money + "입니다.");
		System.out.println("************************************");
	}
}
