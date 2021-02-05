
public class Wall implements Obstacles{
	private int heightWall;

	public Wall(int heightWall) {
		super();
		this.heightWall = heightWall;
	}
	
	public boolean action(Action jumper){
		
		
		if(jumper.getMaxHeightJump() >= heightWall){
			jumper.jump();
			return true;
		} else {
			return false;
		}
		
	}
}
