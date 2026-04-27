/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;


//ここにICelebrityインターフェースを記述
interface ICelebrity {
	void learn();
}

//ここにSamuraiクラスを記述
abstract class Samurai {

    protected String name;

    void fight() {
        System.out.println("戦うよ～。");
    }

    abstract void work();
}


//ここにRetainerクラスを記述
class Retainer extends Samurai implements ICelebrity {
	protected String domain;

	public Retainer(){

	}

	@Override
	public String toString(){
		return "拙者は" + domain + "藩士、" + name + "ともうす。";
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}
	
	@Override
	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai implements ICelebrity {
	public Ronin() {

	}
	
	@Override
	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}

	@Override
	void work() {
		System.out.println("傘張りするよ～。");
	}
	
	@Override
	public void learn() {
		System.out.println("塾を開くよ～。");
	}
}

public class CastleTown {

    public static void main(String[] args) {
        System.out.println("藩士1：");


        //ここに適切な処理を記述
        Retainer retainer = new Retainer();
        retainer.learn();


        System.out.println("\n浪人1：");


        //ここに適切な処理を記述
        Ronin ronin = new Ronin();
        ronin.learn();

    }
}
