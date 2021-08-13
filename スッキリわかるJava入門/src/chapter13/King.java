package chapter13;

public class King {
	void talk(Hero h) {
		System.out.println("ようこそ我が国へ、勇者" + h.getName() + "よ。");
		System.out.println("お前のHPは、" + h.getHp() + "じゃな。");
	}
}
