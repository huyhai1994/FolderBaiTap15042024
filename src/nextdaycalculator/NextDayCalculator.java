package nextdaycalculator;

public class NextDayCalculator {
    private int days;
    private int months;
    private int years;
    static final int MAX_MONTHS_OF_YEAR = 12;
    public static final String CONCATENATE = "/";

    public NextDayCalculator(int days, int months, int years) {
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public int estimateDaysOfMonthWithYear() {
        int daysInMonth;
        boolean isMonthsIs4 = this.months == 4;
        boolean isMonthsIs6 = this.months == 6;
        boolean isMonthsIs9 = this.months == 9;
        boolean isMonthsIs11 = this.months == 11;
        boolean isMonthsIs2 = this.months == 2;
        if (isMonthsIs4 || isMonthsIs6 || isMonthsIs9 || isMonthsIs11) {
            daysInMonth = 30;
        } else {
            if (isMonthsIs2) {
                boolean isYearsDivisibleBy4 = this.years % 4 == 0;
                daysInMonth = (isYearsDivisibleBy4) ? 29 : 28;
            } else {
                daysInMonth = 31;
            }
        }
        return daysInMonth;
    }

    public String increaseADay() {
        int nextMonth, nextDay;

        if (checkNextDaysPassTheDaysOfMonth()) {
            nextMonth = this.months + 1;
            nextDay = 1;
        } else {
            nextDay = this.days + 1;
            nextMonth = this.months;
        }
        if (checkNextMonthPassTheMaxMonthOfYear(nextMonth)) {
            nextMonth = 1;
            nextDay = 1;
            this.years = this.years + 1;
        }
        return nextDay + CONCATENATE + nextMonth + CONCATENATE + this.years;
    }

    private boolean checkNextMonthPassTheMaxMonthOfYear(int nextMonth) {
        return nextMonth > MAX_MONTHS_OF_YEAR;
    }

    public boolean checkNextDaysPassTheDaysOfMonth() {
        int theNextDays = this.days + 1;
        return theNextDays > estimateDaysOfMonthWithYear();
    }
}
