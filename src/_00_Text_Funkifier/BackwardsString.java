package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for(int i = 0; i < s.length()/2-1 ; i++) { 
			char k = chars[i];
			chars[i] = chars[chars.length-1-i];
			chars[chars.length-1-i] = k;
			
		}
		return s;
	}

}
