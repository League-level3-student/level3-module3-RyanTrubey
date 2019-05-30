package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for(int i = 0; i < s.length()/2; i++) {
			System.out.println(s.charAt(i));
			char k = s.charAt(i);
			s.replace(s.charAt(i), s.charAt(s.length()-1-i));
			s.replace(s.charAt(s.length()-1-i), k);
		}
		return s;
	}

}
