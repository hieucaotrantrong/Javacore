package Buoi15;

public class myDate {
    private int day;
    private int month;
    private int year;

    // phuong thuc equal and hascode
    // constructor
    public myDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 31)
            this.month = month;
    }

    public void setYear(int year) {
        if (year >= 1)
            this.year = year;
    }

    @Override
    public String toString() {
        return "myDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        myDate other = (myDate) obj;
        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;
        return true;
    }

}
