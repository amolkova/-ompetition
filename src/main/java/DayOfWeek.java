
public enum DayOfWeek {
	Monday("Понедельник", 8),
	Tuesday("Вторник", 8), 
	Wednesday("Среда", 8), 
	Thursday("Четверг", 8), 
	Friday("Пятница", 8), 
	Saturday("Суббота", 0), 
	Sunday("Восресенье", 0);   
	
	
	private String rusName;
	private int workHours;
	
	private DayOfWeek(String rusName, int workHours) {
		this.rusName = rusName;
		this.workHours = workHours;
	}
	
	public String getRusName() {
		return rusName;
	}

	public int getWorkHours() {
		return workHours;
	}
}
