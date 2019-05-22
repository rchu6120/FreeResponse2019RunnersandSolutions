public class APCalendarRunner {
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year) {
        int a1 = year - 1;
        return (((5 * a1) % 4) + 1 + ((4 * a1) % 100) + ((6 * a1) % 400)) % 7;
    }

    private static int dayOfYear(int month, int day, int year) {
        return (month * 30) + day;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int num1 = firstDayOfYear(year);
        int num2 = dayOfYear(month, day, year);
        int num3 = (num1 + num2) - 1;
        if (num3 > 6) {
            return num3 % 7;
        }
        else {
            return num3;
        }
    }

    public static void main(String[] args) {
        numberOfLeapYears(2010,2019);
        dayOfWeek(3,8,2019);


    }
}
