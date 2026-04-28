/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題2 商品の展示
 *
 * [問題1]の表示を行った後で
 * 以下の実行例と同じものを表示してください。
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250
 * ショコラ      \280
 * ピスターシュ  \320
 *
 */

package lesson01.challenge02;

public class Patisserie {
	public static void main(String[]  args) {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン      \\250");
		System.out.println("ショコラ      \\280");
		System.out.println("ピスターシュ  \\320");
		
		/* 自分で調べたこと
		 * System.out.println(String.format("%-10s", "Left"));
		 * System.out.println(String.format("%10s", "Right"));  // 右寄せ
		 * %-10s で左寄せ
		 * %10d で右寄せ
		 * 今回は上手く扱えなかった泣
		 */
	}

}
