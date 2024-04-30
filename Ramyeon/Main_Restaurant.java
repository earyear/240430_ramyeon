package Ramyeon;

public class Main_Restaurant {

	public static void main(String[] args) {
		
		RaraRamyeon rmy = new RaraRamyeon();
		System.out.println("라라라면 출시");
		
		//국물 여부
		rmy.soupOrNot("국물"); 
		
		//면굵기
		rmy.NoodleThickness(5); 
		
		//토핑선택
		String[] toppingSource = {"고수",
				"양파","숙주","소고기","쪽파","레몬"
				,"마늘"};
		rmy.Topping(toppingSource);
		
		//사이드메뉴
		String[] source = {"칠리","땅콩",
				"고추","호두","물고기소스"};
		rmy.SideMenu(source);
		
		System.out.println(Price.price);
		
		System.out.println("라라라면 완성");
		
	}

}
