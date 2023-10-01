/**
 * клас година (Hour) представляє другу сутність завдання
 * містить поля String time; int passengerCount; String comment;
 * імплементує інтерфейс Comparable для порівняння єкземплярів свого класу
 * також містить перевизначені методи класу Object
 */

import java.util.Objects;

public class Hour implements Comparable<Hour> {
    private String time;
    private int passengerCount;
    private String comment;

    public Hour(String time, int passengerCount, String comment) {
        this.time = time;
        this.passengerCount = passengerCount;
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public String getComment() {
        return comment;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour = (Hour) o;
        return passengerCount == hour.passengerCount && Objects.equals(time, hour.time) && Objects.equals(comment, hour.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, passengerCount, comment);
    }

    @Override
    public String toString() {
        return "Hour{" +
                "time='" + time + '\'' +
                ", passengerCount=" + passengerCount +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public int compareTo(Hour otherHour) {
        int timeComparison = this.time.compareTo(otherHour.time);
        if (timeComparison != 0) {
            return timeComparison;
        }

        int passengerCountComparison = Integer.compare(this.passengerCount, otherHour.passengerCount);
        if (passengerCountComparison != 0) {
            return passengerCountComparison;
        }

        return this.comment.compareTo(otherHour.comment);
    }
}

