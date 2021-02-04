import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		List <Action> actionList = new ArrayList<Action>();
		actionList.add(new Man());
		actionList.add(new Cat());
		actionList.add(new Robot());
		
		for (Action i : actionList) {
			i.jump();
			i.run();
		}
		}

}
