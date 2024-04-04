package util;

public class Helper {

    private static final String REGEX_NAME = "^[a-zA-Z]";
    private static final String REGEX_DATE = "^\\d{4}-\\d{2}-\\d{2}$";

    public static boolean isCheckEmpty(String str) {
        return str.trim().isEmpty();
    }

    public static boolean isCheckName(String name) {
        return name.trim().matches(REGEX_NAME);
    }

    public static boolean isCheckDate(String date) {
        return !date.trim().matches(REGEX_DATE);
    }
}
