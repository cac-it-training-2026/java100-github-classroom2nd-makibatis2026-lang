/**
 * 第4章 倉庫番のお仕事
 *
 * 問題10 荷物の作成（ランダムに要素を詰める）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 箱の中にはいくつかの空き箱があります。
 * （空きは数値の0で表現します）
 * どの箱が空き箱になるのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例1>
 *  E主任：
 *  MQ運送から預かった荷物の確認をお願いします。
 *
 *  Yさん：
 *  はい、
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  です。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 * <実行例2>
 *  E主任：
 *  MQ運送から預かった荷物の確認をお願いします。
 *
 *  Yさん：
 *  はい、
 *
 *  C...5,0,0,0,9
 *
 *  D...0,6,0,3,7
 *
 *  E...2,5,0,6,10
 *
 *  です。
 *
 *  E主任：
 *  ご苦労さまでした。
 */

package lesson04.challenge10;

public class WarehouseManager {

	public static void main(String[] args) {


		//ここに必要な配列の宣言を記述する。
		int[] boxC = new int[5];
		int[] boxD = new int[5];
		int[] boxE = new int[5];
		int[] empty = {0, 1, 1, 1}; // 空箱を決めるのに使う配列

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		// 空箱を決める処理（空箱：0, 中身あり：1）
		for (int i = 0; i < boxC.length; i++) {
			int emptyNum = (int) (Math.random() * 4);
			boxC[i] = empty[emptyNum];
		}
		// 空箱以外の箱に数字を代入する処理
		for (int i = 0; i < boxC.length; i++) {
			if (boxC[i] == 1) {
				boxC[i] = (int) (Math.random() * 10) + 1;
			}else {
				continue;
			}
		}
		// 空箱を決める処理（空箱：0, 中身あり：1）
		for (int i = 0; i < boxD.length; i++) {
			int emptyNum = (int) (Math.random() * 4);
			boxD[i] = empty[emptyNum];
		}
		// 空箱以外の箱に数字を代入する処理
		for (int i = 0; i < boxD.length; i++) {
			if (boxD[i] == 1) {
				boxD[i] = (int) (Math.random() * 10) + 1;
			}else {
				continue;
			}
		}
		// 空箱を決める処理（空箱：0, 中身あり：1）
		for (int i = 0; i < boxE.length; i++) {
			int emptyNum = (int) (Math.random() * 4);
			boxE[i] = empty[emptyNum];
		}
		// 空箱以外の箱に数字を代入する処理
		for (int i = 0; i < boxE.length; i++) {
			if (boxE[i] == 1) {
				boxE[i] = (int) (Math.random() * 10) + 1;
			}else {
				continue;
			}
		}


		System.out.println("E主任：");
		System.out.println("MQ運送から預かった荷物の確認をお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、\n");

		System.out.print("C...");


		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int cNum : boxC) {
			System.out.print(cNum + ", ");
		}


		System.out.print("\n\nD...");


		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int dNum : boxD) {
			System.out.print(dNum + ", ");
		}

		System.out.print("\n\nE...");


		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int eNum : boxE) {
			System.out.print(eNum + ", ");
		}

		System.out.println("\n\nです。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
