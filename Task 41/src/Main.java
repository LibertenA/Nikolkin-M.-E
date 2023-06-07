public class Main {
    private final int minute = 60;
    private final int hour = 60 * minute;
    private final int day = 24 * hour;
    private final int week = 7 * day;
    private final int month = 30 * day;
    private final int year = 365 * day;

    public String calculateTime(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }

        if (seconds == 0) {
            return "0 секунд";
        }

        int years = seconds / year;
        seconds -= years * year;
        int months = seconds / month;
        seconds -= months * month;
        int weeks = seconds / week;
        seconds -= weeks * week;
        int days = seconds / day;
        seconds -= days * day;
        int hours = seconds / hour;
        seconds -= hours * hour;
        int minutes = seconds / minute;
        seconds -= minutes * minute;

        StringBuilder sb = new StringBuilder();
        if (years > 0) {
            sb.append(years).append(" ").append(formatWord(years, "год", "года", "лет"));
        }
        if (months > 0) {
            appendDelimiter(sb);
            sb.append(months).append(" ").append(formatWord(months, "месяц", "месяца", "месяцев"));
        }
        if (weeks > 0) {
            appendDelimiter(sb);
            sb.append(weeks).append(" ").append(formatWord(weeks, "неделя", "недели", "недель"));
        }
        if (days > 0) {
            appendDelimiter(sb);
            sb.append(days).append(" ").append(formatWord(days, "день", "дня", "дней"));
        }
        if (hours > 0) {
            appendDelimiter(sb);
            sb.append(hours).append(" ").append(formatWord(hours, "час", "часа", "часов"));
        }
        if (minutes > 0) {
            appendDelimiter(sb);
            sb.append(minutes).append(" ").append(formatWord(minutes, "минута", "минуты", "минут"));
        }
        if (seconds > 0) {
            appendDelimiter(sb);
            sb.append(seconds).append(" ").append(formatWord(seconds, "секунда", "секунды", "секунд"));
        }

        return sb.toString();
    }

    private void appendDelimiter(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }

    private String formatWord(int number, String form1, String form2, String form5) {
        if (number % 10 == 1 && number % 100 != 11) {
            return form1;
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            return form2;
        } else {
            return form5;
        }
    }
}