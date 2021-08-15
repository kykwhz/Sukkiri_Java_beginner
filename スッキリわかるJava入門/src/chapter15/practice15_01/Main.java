package chapter15.practice15_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 
		StringBuilder s = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			s.append(i + ",");
		}
		System.out.println(s);

		// 文字列sを間まで分割し、String配列aに格納した。
		String[] a = s.toString().split("[,]");
		for (String i : a)
			System.out.println(i);
	}

}
