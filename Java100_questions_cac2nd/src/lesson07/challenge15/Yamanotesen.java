package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		String[] stationChecker = {"大崎", "五反田", "目黒", "恵比寿", "渋谷",
				"原宿", "代々木", "新宿", "新大久保", "高田馬場", 
				"目白", "池袋", "大塚", "巣鴨", "駒込", 
				"田端", "西日暮里", "鶯谷", "上野", "御徒町", 
				"秋葉原", "神田", "東京", "有楽町", "新橋", 
				"浜松町", "田町", "日暮里", "高輪ゲートウェイ", "品川"};
		String[] inputStation = new String[30];
		for (int i = 0; i < inputStation.length; i++) {
			inputStation[i] = "駅" + i;
		}
		
		boolean yesYamanote = false;
		boolean yesDuplication = false;
		boolean win = false;
		int num = 0; // inputStationのインデント

		for (int i = 0; i < stationChecker.length; i++) {
			yesYamanote = false;
			yesDuplication = false;
			
			String input = reader.readLine();

			for (int j = 0; j < stationChecker.length; j++) {
				// 山手線の駅かチェックする
				String checker = stationChecker[j];
				if (checker.equals(input)) {
					yesYamanote = true;
				}
			}

			if (yesYamanote) {
				// 山手線の駅である場合
				for (int j = 0; j < num; j++) {
					// 既出の駅名かチェックする
					String checker = inputStation[j];
					if (checker.equals(input)) {
						// 既出の駅の場合
						yesDuplication = true;
					}
				}
			}else if (yesYamanote == false) {
				 break;
			}
			
			if (yesDuplication) {
				break;
			}
			inputStation[num] = input;
			num ++;
		}

		if (yesDuplication == false && yesYamanote == true) {
			win = true;
			
			}else {
				System.out.println("あなたの負けです！");
			}

		if (win) {
			System.out.println("あなたの勝ちです！");
		}
	}

}
