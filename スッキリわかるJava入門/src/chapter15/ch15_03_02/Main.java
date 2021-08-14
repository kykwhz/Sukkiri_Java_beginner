package chapter15.ch15_03_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		
		String a1 = "test";
		a1 = a1 + "!"; // 文字列結合演算子でidが変わった。
		sb.append(a1); // StringBuilderでappendしてもidは変わらなかった。
	}

}
