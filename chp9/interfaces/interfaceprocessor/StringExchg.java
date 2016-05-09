package chp9.interfaces.interfaceprocessor;
import static myutil.Print.*;

public class StringExchg {
	public String exchg(String s) {
		print("exchg each pair: " + s);
		return s;
	}
	public String name() {
		return "StringExchg";
	}
	public static void main(String[] args) {
		String s = "A test of adapter pattern";
		// 适配器
		Apply.process(new StringAdapter(new StringExchg()), s);
	}
}

// 适配器模式
class StringAdapter implements Processor {
	StringExchg ex;
	public StringAdapter(StringExchg ex) {
		this.ex = ex;
	}
	public String name() {
		return ex.name();
	}
	public Object process(Object input) {
		return ex.exchg((String)input);
	}
}