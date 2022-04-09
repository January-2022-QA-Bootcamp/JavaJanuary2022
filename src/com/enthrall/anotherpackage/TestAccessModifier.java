package com.enthrall.anotherpackage;

import singleton.AccessModifier;

public class TestAccessModifier extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		//int a = singnletonClass.defaultInt;
		String publicString = accessModifier .nameString;
		double protectedDouble = accessModifier .protectedDouble;
		double a = protectedDouble;
		//int b = defaultInt;
		//AccessModifier accessModifier2 = accessModifier;
		
		System.out.println(accessModifier.hashCode());
		
		TestAccessModifier objAccessModifier = new TestAccessModifier();
		System.out.println(objAccessModifier.hashCode());
	}
}
