package _00_Text_Funkifier;

public class CustomString extends SpecialString {
	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for(int i = 2; i < chars.length; i+=3) {
			chars[i] = Character.toUpperCase(chars[i]);
		}
		chars[0] = Character.toLowerCase(chars[0]);
		for(int i = 0; i < chars.length; i++) {
			s = s+chars[i];
		}
		return s;
	}
}
