/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

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
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

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

		System.out.println("\n\nでした。直してきます...\n");


		//ここに詰め替え処理を記述する
		int pointmark = 0; // 空箱フラグ
		int nummark = 0; // 空箱があるインデント
		
		for (int i = 0; i < boxC.length; i++) {
			if (boxC[i] == 0 && pointmark == 0) {
				// 箱が空箱で、空箱フラグが立っていないとき
				pointmark = 1; // フラグを立てる
				nummark = i; // インデントを保存
			}else if (boxC[i] == 0 && pointmark == 1) {
				// 箱が空箱で、空箱フラグが立っているとき
				continue;
			}else if (boxC[i] != 0 && pointmark == 0) {
				// 中身ありで、空箱フラグが立っていないとき
				continue;
			}else if (boxC[i] != 0 && pointmark == 1) {
				// 中身ありで、空箱フラグが立っているとき
				pointmark = 0;
				boxC[nummark] = boxC[i];
				boxC[i] = 0;
				i = nummark;
				nummark = 0;
			}
		}
		
		pointmark = 0;
		nummark = 0;
		for (int i = 0; i < boxD.length; i++) {
			if (boxD[i] == 0 && pointmark == 0) {
				// 箱が空箱で、空箱フラグが立っていないとき
				pointmark = 1; // フラグを立てる
				nummark = i; // インデントを保存
			}else if (boxD[i] == 0 && pointmark == 1) {
				// 箱が空箱で、空箱フラグが立っているとき
				continue;
			}else if (boxD[i] != 0 && pointmark == 0) {
				// 中身ありで、空箱フラグが立っていないとき
				continue;
			}else if (boxD[i] != 0 && pointmark == 1) {
				// 中身ありで、空箱フラグが立っているとき
				pointmark = 0;
				boxD[nummark] = boxD[i];
				boxD[i] = 0;
				i = nummark;
				nummark = 0;
			}
		}
		
		pointmark = 0;
		nummark = 0;
		for (int i = 0; i < boxE.length; i++) {
			if (boxE[i] == 0 && pointmark == 0) {
				// 箱が空箱で、空箱フラグが立っていないとき
				pointmark = 1; // フラグを立てる
				nummark = i; // インデントを保存
			}else if (boxE[i] == 0 && pointmark == 1) {
				// 箱が空箱で、空箱フラグが立っているとき
				continue;
			}else if (boxE[i] != 0 && pointmark == 0) {
				// 中身ありで、空箱フラグが立っていないとき
				continue;
			}else if (boxE[i] != 0 && pointmark == 1) {
				// 中身ありで、空箱フラグが立っているとき
				pointmark = 0;
				boxE[nummark] = boxE[i];
				boxE[i] = 0;
				i = nummark;
				nummark = 0;
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

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

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
