public class Calendar1 {	
	static int dayOfMonth = 1; //  1.1.1900   
	static int month = 1; // 1.1900
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January

	public static void main(String args[]) {
	 int givenYear = Integer.parseInt(args[0]);
	 	while (year <= givenYear) {	
	 		advance();

	 		if (year == givenYear) {	
	 			if(dayOfWeek == 1){
	 		System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
	 			} else {
	    	System.out.println(dayOfMonth + "/" + month + "/" + year);
				}	
	 		}	
        }
	 }
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
	 	dayOfWeek++; // moves to the next day of the week
	 	if (dayOfWeek > 7) {
	 		dayOfWeek = 1;
	 	}
	 	dayOfMonth++; // increment the day of the month in numbers
	 	nDaysInMonth = nDaysInMonth(month, year);
	 	if (dayOfMonth > nDaysInMonth){
	 		dayOfMonth = 1;
	 		month++;
	 		if (month > 12){
	 		month = 1;
	 		year++;
	 		}
	 		if (month == 2 && isLeapYear(year)) {
				dayOfMonth = 29;
        	}
	 	}
	 } 
		 
	public static boolean isLeapYear(int year) {
		return ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
	}
	 
	public static int nDaysInMonth(int month, int year) {
    switch (month){
    case 1: // january
    case 3: // march
    case 5: // may
    case 7: // july
    case 8: // august
    case 10: // october
    case 12: // december	
    	return 31;
    case 4: // april
    case 6: // june
    case 9: // september
    case 11: //november
    	return 30;
    case 2: // february
    	return (isLeapYear(year) ? 29 : 28);
    default:
    	return -1;	// not a month number
    	}
	}
}