/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException{ // throws IOExceptionを必ず書く
		int cit_sto = 30; // シトロンの在庫数
		int cho_sto = 30; // ショコラの在庫数
		int pis_sto = 30; // ピスターシュの在庫数
		
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");		

		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + cit_sto + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + cho_sto + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis_sto+ "個");
		
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		// 入力準備（変数 reader を生成）
		BufferedReader reader = new BufferedReader(new InputStreamReader(System. in));
		System.out.println("シトロン >");
		// 入力した文字列を変数に代入
		String cit_buy_str = reader. readLine();
		int cit_buy = Integer.parseInt(cit_buy_str);

		System.out.println("ショコラ >");
		String cho_buy_str = reader. readLine();
		int cho_buy = Integer.parseInt(cho_buy_str);
		
		System.out.println("ピスターシュ >");
		String pis_buy_str = reader. readLine();
		int pis_buy = Integer.parseInt(pis_buy_str);
		
		System.out.println("シトロン      " + cit_buy + "個");
		System.out.println("ショコラ      " + cho_buy + "個");
		System.out.println("ピスターシュ  " + pis_buy + "個");
		
		int total_num = cit_buy + cho_buy + pis_buy;
		int total_mon = cit_buy*250 + cho_buy*280 + pis_buy*320;
		
		System.out.println("\n合計個数" + total_num + "個");
		System.out.println("合計金額" + total_mon + "円");
		
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
	}

}
