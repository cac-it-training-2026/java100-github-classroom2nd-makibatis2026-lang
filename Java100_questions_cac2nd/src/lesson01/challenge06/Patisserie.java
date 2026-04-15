/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		
		// ----
		
		cit_sto = cit_sto - cit_buy;
		cho_sto = cho_sto - cho_buy;
		pis_sto = pis_sto - pis_buy;
		
		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + cit_sto + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + cho_sto + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis_sto + "個");
	}

}
