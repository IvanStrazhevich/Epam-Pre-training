package by.epam.training.task2.nextDatePredictor;


public class NextDayIs {
    public static boolean isLeapYear(Integer year) {
        if (( year % 4 ) != 0) {
            return false;
        } else if (( ( year % 400 ) != 0 ) && ( ( year % 100 ) == 0 )) {
            return false;
        } else {
            return true;
        }
    }

    public static String getNextDay(Integer day, Integer month, Integer year) {
        if (day < 32 && month < 13) {
            if (month == 2) {
                if (day < 30) {
                    if (isLeapYear(year)) {
                        if (day == 29) {
                            day = 1;
                            month++;
                        } else {
                            day++;
                        }
                    } else if (day < 29) {
                        if (day == 28) {
                            day = 1;
                            month++;
                        } else {
                            day++;
                        }
                    } else {
                        return "Wrong day entered, this year is not leap";
                    }
                } else {
                    return "Wrong day entered, in february are 29 days in leap year and 28 in other years";
                }
            } else if (month == 12) {
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else {
                    day++;
                }
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                if (day.equals(31)) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 31) {
                    if (day.equals(30)) {
                        day = 1;
                        month++;
                    } else {
                        day++;
                    }
                } else {
                    return "Wrong day entered, there is no more then 30 days in this month";
                }
            }
            return "Next day is " + day + " of month " + month + " of the year " + year;
        } else {
            return "Wrong date entered";
        }
    }
}
