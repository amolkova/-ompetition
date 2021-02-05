
public class Man implements Action{
	
	private int maxDistance;
	private int maxHeightJump;
	private String name;
	
	public Man(String name, int maxDistance, int maxHeightJump) {
		super();
		this.maxDistance = maxDistance;
		this.maxHeightJump = maxHeightJump;
		this.name = name;
	}

	@Override
	public int getMaxDistance() {
		
		return maxDistance;
	}
	
	@Override
	public int getMaxHeightJump() {
		
		return maxHeightJump;
	}
	
	@Override
	public String getName() {
		
		return name;
	}

}
