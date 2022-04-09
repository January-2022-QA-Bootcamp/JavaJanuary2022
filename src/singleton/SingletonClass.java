package singleton;

public class SingletonClass {

	private static SingletonClass singleton;
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		if(singleton == null) {
			singleton = new SingletonClass();
		}
		return singleton;
	}
	
	public void voidMethod() {
		System.out.println("void method");
	}
	
	public String stringMethod() {
		return "string";
	}
	
	public int intMethod() {
		return 0;
	}
}
