package chapter13;

public class Hero {
	private int hp;
	private String name;
	Sword sword;

	public Hero(String string, int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.setName(string);
		this.setHp(i);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// sleepメソッドのpublicは外した。
	// この場合、package privateを指定したとみなされる。
	// 同じパッケージに属するクラスからの呼び出しのみ可能になる。
	void sleep() {
		this.hp = 100;
		System.out.println(this.getName() + "は、眠って回復した！");
	}

	private void die() {
		System.out.println(this.getName() + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
}
