package chp6.permission.subpack;

public class Book {
	private String desc;
	public Book(String str) {
		desc = str;
	}

	protected void setDesc(String str) {
		desc = str;
	}
	
	public String getDesc() {
		return desc;
	}
}
