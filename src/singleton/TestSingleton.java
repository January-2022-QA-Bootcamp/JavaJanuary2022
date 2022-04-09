package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonClass singletonClass = SingletonClass.getInstance();
		SingletonClass singletonClass2 = SingletonClass.getInstance();
		SingletonClass singletonClass3 = SingletonClass.getInstance();
		System.out.println(singletonClass.hashCode());
		System.out.println(singletonClass2.hashCode());
		System.out.println(singletonClass.equals(singletonClass2));
		System.out.println(singletonClass3.hashCode());
		
		AccessModifier accessModifier = new AccessModifier();
		AccessModifier accessModifier2 = new AccessModifier();
		AccessModifier accessModifier3 = new AccessModifier();
		System.out.println(accessModifier.equals(accessModifier2));
		System.out.println(accessModifier.hashCode());
		System.out.println(accessModifier2.hashCode());
		System.out.println(accessModifier3.hashCode());
	}
}
