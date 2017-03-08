package labact3;

import java.util.Calendar;

class labact3 {
	public int second;
	public int minute;
	public int hour;

	public labact3() {
	Calendar calendar = Calendar.getInstance();  
	this.second = calendar.get(Calendar.SECOND);  
    this.minute = calendar.get(Calendar.MINUTE);  
    this.hour = calendar.get(Calendar.HOUR_OF_DAY);  
    int t=5;
    		
	}
}
