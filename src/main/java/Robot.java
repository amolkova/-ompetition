
public class Robot implements Action{
	
	private int maxDistance;
	private int maxHeightJump;
	private String name;

	public Robot(String name, int maxDistance, int maxHeightJump) {
		super();
		this.maxDistance = maxDistance;
		this.maxHeightJump = maxHeightJump;
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getMaxDistance() {
		
		return maxDistance;
	}
	
	@Override
	public int getMaxHeightJump() {
		
		return maxHeightJump;
	}
}
