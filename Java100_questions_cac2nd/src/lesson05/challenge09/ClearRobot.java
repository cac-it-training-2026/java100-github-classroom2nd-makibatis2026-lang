package lesson05.challenge09;

public class ClearRobot {
	void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}
	}

}
