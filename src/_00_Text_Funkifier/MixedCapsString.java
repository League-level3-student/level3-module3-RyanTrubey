package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for(int i = 1; i < chars.length; i+=2) {
			chars[i] = Character.toUpperCase(chars[i]);
		}
		for(int i = 0; i < chars.length; i+=2) {
			chars[i] = Character.toLowerCase(chars[i]);
		}
		for(int i = 0; i < chars.length; i++) {
			s = s+chars[i];
		}
		return s;
	}

}
