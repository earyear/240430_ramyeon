package Ramyeon;

public class RaraRamyeon {
	
	public void soupOrNot(String soup) {
		if (soup =="국물") {
			System.out.println("국물 YES");
		} else {
			System.out.println("국물 NO");
		}
	}
	
	public void NoodleThickness(int size) {
		if (size <= 5) {
			System.out.println("가는 면으로 할게요.");
		} else {
			System.out.println("굵은 면으로 할게요.");
		}
	}

	public void Topping(String[] ToppingSources) {
		for (int i = 0; i < ToppingSources.length; i++) {
			System.out.println("토핑 선택 " + (i+1) +" : " + ToppingSources[i]);
		}
		
	}

	public void SideMenu(String[] ChooseSideMenu) {
		for (int i = 0; i < ChooseSideMenu.length; i++) {
			System.out.println("사이드 메뉴 추가 " + (i+1) +" : " + ChooseSideMenu[i]);
		}
	}
}
