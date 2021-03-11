
public class TreadMill implements Obstacles {
	private int length;

	public TreadMill(int length) {
		super();
		this.length = length;
	}
	
	public boolean action(Action runner){
		
		if(runner.getMaxDistance() >= length){
			runner.run();
			return true;
		} else {
			return false;
		}
		
		
	}


}
