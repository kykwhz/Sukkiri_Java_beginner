package chapter14.toString;

public class Code14_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);
	}

}

// メソッドもフィールドもいっさい定義していないクラス(Empty.javaのEmptyクラス)の
// toString()を呼び出している。
//
// 暗黙の継承
// あるクラスを定義するとき、extendsで親クラスを指定しなければ、
// java.lang.Objectを親クラスとして継承したと見なされる。