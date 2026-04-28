/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		int total_num_int = (int) total_num;
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
		
		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味      " + "・・・ " + (int) (((cit_buy*250)/total_mon)*100) + "%");
		System.out.println("ショコラの味      " + (int) (cho_buy*280) + "・・・ " + (int) (((cho_buy*280)/total_mon)*100) + "%");
		System.out.println("ピスターシュの味  " + (int) (pis_buy*320) + "・・・ " + (int) (((pis_buy*320)/total_mon)*100) + "%");
		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は" + Math.round((total_mon/total_num_int) / 10)*10 + "円です。");
		
	}

}
