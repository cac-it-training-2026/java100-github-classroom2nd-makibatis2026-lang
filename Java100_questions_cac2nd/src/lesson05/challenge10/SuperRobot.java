package lesson05.challenge10;

public class SuperRobot {
	int ebifry;
	void makeOmelet(int ebiNum, int flourNum, int eggNum, int pankoNum) {
		// ebiNumが1につき、flourNum = 5、pankoNum = 5とeggNum =1が必要
		// ebiNumが20ごとにeggNumが1
		int byEbi = ebiNum;
	    int byFlour = flourNum / 5;
	    int byPanko = pankoNum / 5;
	    int byEgg = eggNum * 20;

	    int ebifry = Math.min(Math.min(byEbi, byFlour), Math.min(byPanko, byEgg));

		System.out.println("\n" + ebifry + "本のエビフライを作成しました\n");
	}
}
