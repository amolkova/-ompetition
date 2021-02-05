
public enum DayOfWeek {
	Monday("�����������", 8),
	Tuesday("�������", 8), 
	Wednesday("�����", 8), 
	Thursday("�������", 8), 
	Friday("�������", 8), 
	Saturday("�������", 0), 
	Sunday("����������", 0);   
	
	
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
