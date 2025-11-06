<<<<<<< HEAD:Time/src/Time.java
/**
 * @author zbist
 * This class is used to make and work with times.
 * A time has hours, minutes, and seconds.
 * You can print the time, compare two times, and add them together.
 */
=======
package code;

>>>>>>> 5fb7104cc5ad3cb4729066818755c16183dca246:Time/src/code/Time.java
public class Time {

    /** The hours part of the time. */
    private int hours;

    /** The minutes part of the time. */
    private int minutes;

    /** The seconds part of the time. */
    private double seconds;

    /**
     * Makes a new time set to 0 hours, 0 minutes, and 0 seconds.
     */
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0.0;
    }

    /**
     * Makes a new time with the given hours, minutes, and seconds.
     *
     * @param hours how many hours
     * @param minutes how many minutes
     * @param seconds how many seconds
     */
    public Time(int hours, int minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Gets the hours.
     *
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the hours.
     *
     * @param hours the new hour value
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Gets the minutes.
     *
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Sets the minutes.
     *
     * @param minutes the new minute value
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * Gets the seconds.
     *
     * @return the seconds
     */
    public double getSeconds() {
        return seconds;
    }

    /**
     * Sets the seconds.
     *
     * @param seconds the new seconds value
     */
    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    /**
     * Prints out a time in the format hh:mm:ss.s
     *
     * @param t the time to print
     */
    public static void printTime(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n", t.hours, t.minutes, t.seconds);
    }

    /**
     * Checks if this time is the same as another time.
     * The times are the same if hours and minutes match,
     * and the seconds are very close.
     *
     * @param that another time
     * @return true if they are the same, false if not
     */
    public boolean equals(Time that) {
        final double DELTA = 0.001;
        return this.hours == that.hours &&
               this.minutes == that.minutes &&
               Math.abs(this.seconds - that.seconds) < DELTA;
    }

    /**
     * Adds this time and another time together.
     * If seconds or minutes go over 60, it fixes them.
     * If hours go over 24, it wraps back around.
     *
     * @param that the other time
     * @return a new time that is the sum
     */
    public Time add(Time that) {
        Time sum = new Time();
        sum.hours = this.hours + that.hours;
        sum.minutes = this.minutes + that.minutes;
        sum.seconds = this.seconds + that.seconds;

        if (sum.seconds >= 60.0) {
            sum.seconds -= 60.0;
            sum.minutes += 1;
        }
        if (sum.minutes >= 60) {
            sum.minutes -= 60;
            sum.hours += 1;
        }
        if (sum.hours >= 24) {
            sum.hours -= 24;
        }

        return sum;
    }

    /**
     * Turns the time into a string that looks like hh:mm:ss.s
     *
     * @return the time as a string
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%04.1f\n", hours, minutes, seconds);
    }
}