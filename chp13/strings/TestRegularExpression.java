package chp13.strings;
import java.util.regex.*;
import static myutil.Print.*;

public class TestRegularExpression {
	public static void main(String[] str) {
//		String[] args = {"Java now has regular expression", "^Java",
//				"\\Breg.*",   // \B非词的边界，此处不匹配
//				"n.w\\s+h(a|i)s",	// \s空白 .任意一个
//				"s?",				// 一个或0个
//				"s*",				// 0个或多个
//				"s+",				// 一个或多个
//				"s{4}",
//				"s{1}",
//				"s{0,3}"};
		
		//(?i) Pattern标记 忽略大小写
		//(?m) ^$ 多行模式下分别匹配各行 
		//(?x) 空格符被忽略掉 #开始的到行末的注释也被忽略
		String[] args = {"Arline ate eight apples and one orange while Anita hadn't any",
				"(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"};
		if(args.length < 2) {
			print("Usage: \njava TestRegularExpression " + 
					"characterSequence regularExpression");
			System.exit(0);
		}
		print("Input: \"" + args[0] + "\"");
		for(String arg : args) {
			print("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()) {
				print("Match \"" + m.group() + "\" + at positions " + 
						m.start() + "-" + (m.end() -1));
			}

		}
	}

}
