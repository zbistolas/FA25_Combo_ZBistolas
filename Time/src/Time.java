
public class Time {
	int hours;
	int minutes;
	double seconds;
	//default constructor
	public Time()
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0.0;
	}
	//values constructor
	public Time(int hours, int minutes, double seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public double getSeconds() {
		return seconds;
	}
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	public static void printTime(Time t)
	{
		System.out.printf("%02d:%02d:%04.1f\n", t.hours,t.minutes,t.seconds );
	}
	
	public boolean equals(Time that)
	{
		final double DELTA = 0.001;
		return this.hours == that.hours
				&& this.minutes == that.minutes 
				&& Math.abs(this.seconds - that.seconds) < DELTA;
	}
	
	public Time add(Time that)
	{
		Time sum = new Time();
		sum.hours = this.hours + that.hours;
		sum.minutes = this.minutes + that.minutes;
		sum.seconds = this.seconds + that.seconds;
		
		if(sum.seconds >= 60.0)
		{
			sum.seconds -= 60.0;
			sum.seconds +=1;
		}
		if(sum.minutes >=60)
		{
			sum.minutes-=60;
			sum.minutes +=1;
		}
		if(sum.hours >=60)
		{
			sum.hours -=60;
			sum.hours++;
		}
		if(sum.hours >= 24)
		{
			sum.hours -=24;
		}
		return sum;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n", hours,minutes,seconds);
	}
	
}
