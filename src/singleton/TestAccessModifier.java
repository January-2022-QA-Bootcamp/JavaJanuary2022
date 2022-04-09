package singleton;

import java.math.BigDecimal;

public class TestAccessModifier extends AccessModifier{

	static int aInt;
	static double bDouble;
	static char cChar;
	static boolean dBol;
	static byte eByte;
	
	static BigDecimal bigDecimal;
	static String string;
	
	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		
		int defaultInt = accessModifier.defaultInt;
		String publicString = accessModifier.nameString;
		double protectedDouble = accessModifier.protectedDouble;
		//AccessModifier accessModifier2 = AccessModifier.accessModifier;
		int a = defaultInt;
		
		System.out.println(aInt);
		System.out.println(bDouble);
		System.out.println((int)cChar);
		System.out.println(dBol);
		System.out.println(eByte);
		System.out.println(bigDecimal);
		System.out.println(string);
	}
}
