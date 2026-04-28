/**
 * 第3章 探検隊のお仕事
 *
 * 問題7  ワニが現れた
 *
 * 進行方向にワニが3匹現れました。
 * このワニはそれぞれグーワニ、チョキワニ、パーワニの何れかです。
 *
 * グーワニは手をパーかグーにして見せるとおとなしくなり、
 * チョキワニは手をグーかチョキにして見せるとおとなしくなり、
 * パーワニは手をチョキかパーにして見せるとおとなしくなるのですが、
 * この3種は外見がまったく一緒で見分けがつきません。
 * （つまり、3匹がそれぞれ1種ずつである場合も
 *   3匹ともグーワニである可能性もあります。）
 *
 * この道を通り抜けるためには、 3匹にそれぞれ勝つか引き分けるか
 * しなければなりません。負けるとその時点でチャレンジ終了となります。
 *
 * コメントの位置にwhile文とif文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  ワニ3匹発見！
 *  グーワニかチョキワニかパーワニのどれかです。
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞2
 *
 *  隊長：
 *  相手はチョキワニでした。
 *  1匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞3
 *
 *  隊長：
 *  相手はグーワニでした。
 *  2匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞1
 *
 *  隊長：
 *  相手はグーワニでした。
 *  3匹目通り抜け成功！
 *
 *  隊長：
 *  川を渡り切りました。
 *
 * <通り抜けに失敗した場合の実行例>
 *  隊長：
 *  相手はグーワニでした。
 *  通り抜けに失敗しました...
 *
 * <範囲外の手が入力された場合の実行例>
 *
 *  隊長：
 *  そんな手はありませんよ。もう一度入れてください。
 *
 */

package lesson03.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("ワニ3匹発見！\n");
		System.out.println("グーワニかチョキワニかパーワニのどれかです。\n");

		int alligator = 0; // ワニの種類
		int hand = 0; // 自分の出した手
		int i = 0; // 通り抜け成功した回数

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//ここにwhile文、if文を利用した処理を記述
		while (i < 3) { // 通り抜け成功回数が３より小さい間は繰り返す（３回勝ったら繰り返し終了）
			// 最初にワニの種類を決定
			alligator = (int) (Math.random() * 10 % 3) + 1;
			// 1:グー, 2:チョキ, 3:パー

			// 自分が何を出すか決定する
			System.out.println("隊長：");
			System.out.println("どの手を出して通り抜けますか");
			System.out.println("（グー… 1 : チョキ… 2 : パー… 3）＞");
			hand = Integer.parseInt(br.readLine());

			if (alligator == 1) { // ワニがグーのとき
				if (hand == 1) { //自分がグーのとき
					System.out.println("\n隊長：");
					System.out.println("相手はグーワニでした。");
					i ++;
					System.out.println(i + "匹目通り抜け成功！\n");

				}else if (hand == 2) { //自分がチョキのとき
					System.out.println("\n隊長：");
					System.out.println("相手はグーワニでした。");
					break;

				}else if (hand == 3) { //自分がパーのとき
					System.out.println("\n隊長：");
					System.out.println("相手はグーワニでした。");
					i ++;
					System.out.println(i + "匹目通り抜け成功！\n");

				}else if (hand > 3) {
					System.out.println("\n隊長：");
					System.out.println("そんな手はありませんよ。もう一度入れてください。\n");

				}

			}else if (alligator == 2) { // ワニがチョキのとき
				if (hand == 1) { //自分がグーのとき
					System.out.println("\n隊長：");
					System.out.println("相手はチョキワニでした。");
					i ++;
					System.out.println(i + "匹目通り抜け成功！\n");

				}else if (hand == 2) { //自分がチョキのとき
					System.out.println("\n隊長：");
					System.out.println("相手はチョキワニでした。");
					i ++;
					System.out.println(i + "匹目通り抜け成功！\n");

				}else if (hand == 3) { //自分がパーのとき
					System.out.println("\n隊長：");
					System.out.println("相手はチョキワニでした。");
					break;

				}else if (hand > 3) {
					System.out.println("\n隊長：");
					System.out.println("そんな手はありませんよ。もう一度入れてください。\n");

				}

			}else if (alligator == 3) { // ワニがパーのとき
				if (hand == 1) { //自分がグーのとき
					System.out.println("\n隊長：");
					System.out.println("相手はパーワニでした。");
					break;

				}else if (hand == 2) { //自分がチョキのとき
					System.out.println("\n隊長：");
					System.out.println("相手はパーワニでした。");
					i ++;
					System.out.println(i + "匹目通り抜け成功！\n");

				}else if (hand == 3) { //自分がパーのとき
					System.out.println("\n隊長：");
					System.out.println("相手はパーワニでした。");
					i ++;
					System.out.println(i + "匹目通り抜け成功！\n");

				}else if (hand > 3) { // continue使えばよかったかも
					System.out.println("\n隊長：");
					System.out.println("そんな手はありませんよ。もう一度入れてください。\n");

				} // これってもしかしてswitch文でもいける？
			}
		}

		if (i == 3) {
			System.out.println("隊長：");
			System.out.println("川を渡り切りました。");
		} else {
			System.out.println("通り抜けに失敗しました...");
		}

	}
}
