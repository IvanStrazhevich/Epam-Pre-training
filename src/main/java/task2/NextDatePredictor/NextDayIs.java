package task2.NextDatePredictor;


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

    public static String getNextDay(Integer day, Integer mounth, Integer year) {
        if (day < 32 && mounth < 13) {
            if (mounth == 2) {
                if (day < 30) {
                    if (isLeapYear(year)) {
                        if (day == 29) {
                            day = 1;
                            mounth++;
                        } else {
                            day++;
                        }
                    } else if (day < 29) {
                        if (day == 28) {
                            day = 1;
                            mounth++;
                        } else {
                            day++;
                        }
                    } else {
                        return "Wrong day entered, this year is not leap";
                    }
                } else {
                    return "Wrong day entered, in february are 29 days in leap year and 28 in other years";
                }
            } else if (mounth == 12) {
                if (day == 31) {
                    day = 1;
                    mounth = 1;
                    year++;
                } else {
                    day++;
                }
            } else if (mounth == 1 || mounth == 3 || mounth == 5 || mounth == 7 || mounth == 8 || mounth == 10) {
                if (day.equals(31)) {
                    day = 1;
                    mounth++;
                } else {
                    day++;
                }
            } else if (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) {
                if (day < 31) {
                    if (day.equals(30)) {
                        day = 1;
                        mounth++;
                    } else {
                        day++;
                    }
                } else {
                    return "Wrong day entered, there is no more then 30 days in this mounth";
                }
            }
            return "Next day is " + day + " of mounth " + mounth + " of the year " + year;
        } else {
            return "Wrong date entered";
        }
    }
}
