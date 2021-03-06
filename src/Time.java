/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.0
 */
public class Time {

    private int hour;
    private int minute;

    /**
     * Constructor for objects of class Time
     *
     * @param startHour becomes initial hour time
     * @param startMinute becomes initial minute time
     *
     */

    public Time ( int startHour, int startMinute){

        hour = startHour;
        minute = startMinute;

    }


    /**
     * @return clock variables
     */

    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    /**
     * get method for hour
     * @return hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * set method for hour
     * @param hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * get method for min
     * @return minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * set method for min
     * @param minute
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }
}
