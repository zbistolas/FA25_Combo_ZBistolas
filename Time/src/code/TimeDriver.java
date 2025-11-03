package code;
public class TimeDriver {

	public static void main(String[] args) {
		Time time = new Time();
		Time time2 = new Time(9, 50, 37.2);
		time.setHours(13);
		time.setMinutes(45);
		time.setSeconds(40.2);
		time.printTime(time);
		System.out.println(time2);
		System.out.println(time2.equals(time));
		Time sum =time.add(time2);
		System.out.println(sum);
	}

}
