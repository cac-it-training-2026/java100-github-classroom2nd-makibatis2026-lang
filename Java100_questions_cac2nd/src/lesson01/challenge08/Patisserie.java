/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException{ // throws IOExceptionを必ず書く
		int cit_sto = 30;
		int cho_sto = 30;
		int pis_sto = 30;
		
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + cit_sto + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + cho_sto + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis_sto + "個");
		
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System. in));
		
		System.out.println("シトロン >");
		String cit_buy_str = reader. readLine();
		float cit_buy = Float.parseFloat(cit_buy_str);

		System.out.println("ショコラ >");
		String cho_buy_str = reader. readLine();
		float cho_buy = Float.parseFloat(cho_buy_str);
		
		System.out.println("ピスターシュ >");
		String pis_buy_str = reader. readLine();
		float pis_buy = Float.parseFloat(pis_buy_str);
		
		System.out.println("シトロン      " + cit_buy + "個");
		System.out.println("ショコラ      " + cho_buy + "個");
		System.out.println("ピスターシュ  " + pis_buy + "個");
		
		float total_num = cit_buy + cho_buy + pis_buy;
		float total_mon_fl = cit_buy*250 + cho_buy*280 + pis_buy*320;
		int total_mon = (int) total_mon_fl;
		
		System.out.println("\n合計個数" + total_num + "個");
		System.out.println("合計金額" + total_mon + "円");
		
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
		
		cit_sto = (int) (cit_sto - cit_buy);
		cho_sto = (int) (cho_sto - cho_buy);
		pis_sto = (int) (pis_sto - pis_buy);
		
		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + cit_sto + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + cho_sto + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pis_sto + "個");
		
		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。");
		System.out.println("売り上げの割合");
		System.out.println("売上合計      \\" + total_mon);
		
		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (cit_buy*250) + "・・・ " + (int) (((cit_buy*250)/total_mon)*100) + "%");
		System.out.println("ショコラ      \\" + (int) (cho_buy*280) + "・・・ " + (int) (((cho_buy*280)/total_mon)*100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (pis_buy*320) + "・・・ " + (int) (((pis_buy*320)/total_mon)*100) + "%");	
		
	}

}
