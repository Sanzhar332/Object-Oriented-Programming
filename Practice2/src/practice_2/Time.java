package practice_2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor to set the time with input validation
    public Time(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid time input.");
        }
    }

    // Check if the input time values are valid
    private boolean isValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour <= 23) &&
               (minute >= 0 && minute <= 59) &&
               (second >= 0 && second <= 59);
    }

    // Method to convert time to Universal format (hh:mm:ss)
    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to convert time to Standard format (hh:mm:ss AM/PM)
    public String toStandard() {
        String period = (hour < 12) ? "AM" : "PM";
        if (hour == 0 || hour == 12) {
            return String.format("12:%02d:%02d %s", minute, second, period);
        } else {
            return String.format("%02d:%02d:%02d %s", hour % 12, minute, second, period);
        }
    }

    // Method to add two Time objects (non-static instance method)
    public void add(Time otherTime) {
        int newHour = this.hour + otherTime.hour;
        int newMinute = this.minute + otherTime.minute;
        int newSecond = this.second + otherTime.second;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }
        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }
        if (newHour >= 24) {
            newHour -= 24;
        }

        this.hour = newHour;
        this.minute = newMinute;
        this.second = newSecond;
    }

    public static void main(String[] args) {
        // Create a Time object with initial values
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); // prints "23:05:06"
        System.out.println(t.toStandard()); // prints "11:05:06 PM"

        // Create another Time object
        Time t2 = new Time(4, 24, 33);

        // Add t2 to t
        t.add(t2);

        // Print the updated time
        System.out.println(t.toUniversal()); // prints the updated time in Universal format
        System.out.println(t.toStandard()); // prints the updated time in Standard format
    }
}