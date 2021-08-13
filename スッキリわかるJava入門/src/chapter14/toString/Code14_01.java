package chapter14.toString;

public class Code14_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Empty e = new Empty();
		System.out.println(e); // (1)

		String s = e.toString();
		System.out.println(s); // 表示結果は、(1)と同じ
	}

}

// メソッドもフィールドもいっさい定義していないクラス(Empty.javaのEmptyクラス)の
// toString()を呼び出している。
//
// 暗黙の継承
// あるクラスを定義するとき、extendsで親クラスを指定しなければ、
// java.lang.Objectを親クラスとして継承したと見なされる。