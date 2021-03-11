
public class Utiliti {
 
	public static String getWorkingHours(DayOfWeek dayOfWeek){
		int currenPositionDayOfWeek = dayOfWeek.ordinal();
		int totalHours = 0;
		int test = dayOfWeek.values().length;
		for (int i = currenPositionDayOfWeek; i < dayOfWeek.values().length; i++) {
			DayOfWeek day = dayOfWeek.values()[i];
			totalHours += day.getWorkHours();
		}
		
		return totalHours == 0 ? "сегодня выходной" : Integer.toString(totalHours);
			
	}
		
}
