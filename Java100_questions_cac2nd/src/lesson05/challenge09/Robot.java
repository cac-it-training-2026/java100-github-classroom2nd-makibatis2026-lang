package lesson05.challenge09;

public class Robot {
	int energy;
	String name;
	int water;
	int omelet;
	String menu;
	
	void randomWater() {
		water = (int) (Math.random() * 9) + 1;
	}
	
	void setWater(int water) {
		this.water = water;
	}
	
	void pumpWater() {
		System.out.println("水を" + water + "リットル出します");
	}
	
	void makeOmelet(int eggNum, int butterNum) {
		if (eggNum < 2 || butterNum < 5) {
			omelet = 0;
		}else if ((eggNum / 2) > (butterNum / 5)) {
			omelet = (butterNum / 5);
		}else if ((eggNum / 2) < (butterNum / 5)) {
			omelet = (eggNum / 2);
		}else if ((eggNum / 2) == (butterNum / 5)) {
			omelet = (butterNum / 5);
		}
		
		System.out.println("\n" + omelet + "人分のオムレツを作成しました\n");
	}
	
	int getWater() {
		return water;
	}
	
	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 50) {
			menu = "クッキー";
			return menu;
		}else if (eggNum >= 2 && butterNum >= 5) {
			menu = "オムレツ";
			return menu;
		}else if (eggNum >= 1) {
			menu = "ゆで卵";
			return menu;
		}else {
			menu = null;
			return menu;
		}
		
		
	}
	//ここに問題7で作成したクラスに次の条件を足したクラスを作成してください。
	//メソッド名：makeEggDishes(引数int flourNum, int sugarNum, int eggNum, int butterNum、
	//戻り値String、作成できるメニューを戻り値として返す。また、作成できるメニューが無い場合はnull値を返す)
}
