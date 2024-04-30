package Ramyeon;

import util.RandomSelectNumber;

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
		
		String[] eatMembers = {"김민수",
				"이현종","이수진",
				"남귀연",	"이연수"};
		
		int selectedNumberofMember = RandomSelectNumber.selectInt(7);
		// 시식자 선정 완료. 
		System.out.println("시식하는 사람은 : " + eatMembers[selectedNumberofMember] + " 당첨.ㅋㅋㅋ");
	}

}
