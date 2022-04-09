package serialization;
import java.io.Serializable;

public class SerializationClass implements Serializable{

	public int a;
	public String b;
	
	public SerializationClass(int a, String b) {
		this.a = a;
		this.b = b;
	}
}
