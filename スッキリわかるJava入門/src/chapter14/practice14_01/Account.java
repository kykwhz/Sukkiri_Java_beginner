package chapter14.practice14_01;

public class Account {
	private String accountNumber; // 口座番号
	private int balance; // 残額

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String string, String string2) {
		// TODO 自動生成されたコンストラクター・スタブ
		setAccountNumber(string);
		setBalance(Integer.parseInt(string2));
	}

	/* (1)文字列表現のメソッド */
	public String toString() {
		return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	
	/* (2)等価判定のメソッド */
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
