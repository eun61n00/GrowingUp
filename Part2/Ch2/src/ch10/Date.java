package ch10;

public class Date {

    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31)
            isValid = false;
        else
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            isValid = false;
        else
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
