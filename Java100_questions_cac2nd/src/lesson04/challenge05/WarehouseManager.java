/**
 * 第4章 倉庫番のお仕事
 *
 * 問題5  袋の中身を調べる【改訂版】
 *
 * AB興産から預かっている荷物を再び検査することになりました。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらに今回はそれぞれの袋の値が重複しないものとします。
 * （つまり、5が入っている袋はただ一つだけ）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 */

package lesson04.challenge05;

public class WarehouseManager {

	public static void main(String[] args) {


		//ここに配列の宣言を記述する
		int data_siz = 5;
		int[] ABnumbers = new int[data_siz];

		int intputNum = 0;
		boolean loopFlag = false;


		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABnumbers.length; i++) {
			// 入れる数字の決定
			intputNum = (int) (Math.random() * 5 + 1);
			
			if (intputNum == 5 && loopFlag == false) {
				// 入れる数字が5でフラグが立ってない場合
				ABnumbers[i] = intputNum;
				loopFlag = true;
				
			}else if (intputNum == 5 && loopFlag == true) {
				// 入れる数字が5でフラグが立っている場合
				i--;
				// もう一度袋に入れる数字を再設定してほしいので
				// iを減らしてcontinue
				continue;
			}else if (i == (ABnumbers.length - 1) && intputNum != 5 && loopFlag == false) {
				// 最後まで5がでなかった場合
				ABnumbers[i] = 5;
			}
		}


		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");


		//ここに要素の確認および何袋目かの出力処理を記述する
		for (int i = 0; i < ABnumbers.length; i++) {
			if (ABnumbers[i] == 5) {
				System.out.println((i + 1) + "袋目");
			}
		}


		System.out.println("に入っていました。");

	}
}
