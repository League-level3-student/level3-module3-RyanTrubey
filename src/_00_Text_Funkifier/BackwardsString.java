package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for(int i = 0; i < chars.length/2; i++) { 
			char k = chars[i];
			chars[i] = chars[chars.length-1-i];
			chars[chars.length-1-i] = k;
		}
		for(int i = 0; i < chars.length; i++) {
			s = s+chars[i];
		}
		return s;
	}

}
