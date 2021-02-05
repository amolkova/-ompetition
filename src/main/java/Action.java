import javax.xml.bind.annotation.XmlIDREF;

public interface Action {
		
	int getMaxDistance();
	int getMaxHeightJump();
	String getName();
	
	public default void jump() {
		System.out.println(getName() + " �������");
		
	}

	public default void run() {
		System.out.println(getName() + " ������");
		
	}
	
}
