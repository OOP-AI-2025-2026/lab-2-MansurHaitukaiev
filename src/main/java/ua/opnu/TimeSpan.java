package ua.opnu;


public class TimeSpan {
    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }

        int sumMinutes = this.minutes + minutes;
        this.hours += hours + sumMinutes / 60;
        this.minutes = sumMinutes % 60;
    }

    void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        int minutesThis = getTotalMinutes();
        int minutesOther = span.getTotalMinutes();

        if (minutesOther > minutesThis) {
            return;
        }

        int substraction = minutesThis - minutesOther;
        this.hours = substraction / 60;
        this.minutes = substraction % 60;
    }

    void scale(int factor) {
        if (factor <= 0) {
            return;
        }

        int total = getTotalMinutes() * factor;
        this.hours = total / 60;
        this.minutes = total % 60;
    }
}