package chapter15.practice15_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test t = new test();
		t.setFolder("c:¥javadev");
		t.setFile("readme.txt");
		String s = t.folder_plus_file();
		System.out.println(s);
	}

}

class test {
	private String folder;
	private String file;

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String folder_plus_file() {
		if (!this.folder.matches(".*¥")) {
			this.folder += "¥";
		}
		return this.folder + this.file;
	}
}