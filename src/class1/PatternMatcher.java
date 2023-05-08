package class1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternMatcher pm=new PatternMatcher();
		pm.practPatternMatcher1();
	

	}
	
	public void practPatternMatcher() {
		Pattern p=Pattern.compile("ga");
		Matcher m=p.matcher("garegareregaaa");
		while(m.find()) {
		System.out.println(m.start()+"to"+(m.end()-1));
		
	}
	}
	
	public void practPatternMatcher1() {
		String str1="hey1there2h3r4u5";
		String delimiter="\\d";
		Pattern pp=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] strArray=pp.split(str1);
		for(String substr:strArray) {
			System.out.println(substr);
		
	}
	}

}
