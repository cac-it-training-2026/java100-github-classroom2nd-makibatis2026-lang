package lesson05.challenge06;

public class Robot {
	int energy;
	String name;
	int water;
	int omelet;
	
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

}
