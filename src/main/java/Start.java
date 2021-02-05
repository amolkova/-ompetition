import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		List <Action> actionList = new ArrayList<Action>();
		actionList.add(new Man("¬ас€", 1000, 1));
		actionList.add(new Cat("ѕушок", 500, 1));
		actionList.add(new Robot("—€ом€", 5000, 2));
		
		List <Obstacles> obstaclesList = new ArrayList<Obstacles>();
		obstaclesList.add(new TreadMill(1000));
		obstaclesList.add(new Wall(1));
		
		for (Action participant : actionList) {
			for (Obstacles obstacles : obstaclesList) {
				if (!obstacles.action(participant)){
					System.out.println(participant.getName() + " снимаетс€ с полосы преп€тствий");
					break;
					
				}
			} 
			
						
		}
		
		
		System.out.println("Task 5 Day of Week");
		
		System.out.println(Utiliti.getWorkingHours(DayOfWeek.Saturday));
		
		
	}

	
	
}
