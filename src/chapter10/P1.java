package chapter10;

public class P1 {

}

class Time
{
	private long hour;
	private long minute;
	private long second;
	
	 public Time() {   
		    this(System.currentTimeMillis());
		  }
	//调用public Time(long elapsedTime) {
	//一个构造TIME对象的构造方法、返回时间 
	 
	public Time(long elapsedTime) {
	    setTime(elapsedTime);   //调用  下面的 public void setTime(long elapsedTime) {
	  }
	
	public Time(long hour, long minute, long second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	public long getHour() {
		return hour;
	}

	public void setHour(long hour) {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(long minute) {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}
	
	 public void setTime(long elapsedTime) {
		  
		    long totalSeconds = elapsedTime / 1000;

		    // Compute the current second in the minute in the hour
		    second = (int)(totalSeconds % 60);

		    // Obtain the total minutes
		    long totalMinutes = totalSeconds / 60;

		    // Compute the current minute in the hour
		    minute = (int)(totalMinutes % 60);

		    // Obtain the total hours
		    int totalHours = (int)(totalMinutes / 60);

		    // Compute the current hour
		    hour = (int)(totalHours % 24);
		  }
	
	
}