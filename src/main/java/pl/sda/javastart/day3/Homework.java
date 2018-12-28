package pl.sda.javastart.day3;

import java.time.LocalDateTime;

public class Homework {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        LocalDateTime actualTime = LocalDateTime.now();
        int day = actualTime.getDayOfMonth();
        int month = actualTime.getMonthValue();
        int year = actualTime.getYear();
        int hour = actualTime.getHour();
        int minute = actualTime.getMinute();
        String hourValue;
        if (hour < 10) {
            hourValue = "0" + hour;
        } else {
            hourValue = Integer.toString(hour);
//            hourValue = "" + hour;   tak mozna drugie rozwiazanie
        }
        String minuteValue = minute < 10 ? "0" + minute : "" + minute;

        System.out.println(hourValue + ":" + minuteValue + '.' + day + '.' + month + '.' + year);
        System.out.println("Od północy mineło " + (hour * 60 + minute));

    }

    }



