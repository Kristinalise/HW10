public enum Month {

	JANUARY(31, "January"), 
	FEBRUARY(28, "February"), 
	MARCH(31, "March"), 
	APRIL(30, "April"), 
	MAY(31, "May"), 
	JUNE(30, "June"), 
	JULY(31, "July"), 
	AUGUST(31, "August"), 
	SEPTEMBER(30, "September"), 
	OCTOBER(31, "October"), 
	NOVEMBER(31, "November"), 
	DECEMBER(31, "December");
	
	private int day;
	private String name;
	
	Month(int theDay, String theName){
		day = theDay;
		name = theName;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getName() {
		return name;
	}
	
}
