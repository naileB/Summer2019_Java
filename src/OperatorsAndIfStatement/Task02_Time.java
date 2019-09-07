package OperatorsAndIfStatement;

public class Task02_Time {
public static void main(String[] args) {
	
	/*Task2
	int hour = 12;
	int minute = 24;
	int second = 33;
	String amORpm = "PM";
	
	System.out.println(hour + ":" +minute + ":" + second +" " + amORpm);
	*/
	

	int hour = 12;
	int minute = 24;
	int second = 33;
	String amORpm;
	if (hour>=12){
		amORpm = "pm";
		if (hour!=12)
			hour=hour-12;

	}
	else {
		amORpm = "am";
	}
	System.out.println(hour + ":" +minute + ":" + second +" " + amORpm);
	
	
	
	
	
}
}
