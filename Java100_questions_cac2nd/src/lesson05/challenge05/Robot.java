package lesson05.challenge05;

public class Robot {
	int energy;
	String name;
	int water;
	
	void randomWater() {
		water = (int) (Math.random() * 9) + 1;
	}
	
	void setWater(int water) {
		this.water = water;
	}
	
	void pumpWater() {
		System.out.println("水を" + water + "リットル出します");
	}

}
