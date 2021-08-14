package chapter15.ch15_02_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java programming";
		//           0123456789012345
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3)); // -> a programming
		System.out.println("文字列s1の4〜8文字目は" + s1.substring(3, 8)); //  -> a pro
		// 位置指定8の文字は含まれない点に注意
	}

}
