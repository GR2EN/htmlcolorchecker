package it.gr2en.hexchecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HtmlColorChecker {

    private static final String HTML_COLOR_PATTERN = "^#([a-f]|[A-F]|[0-9]){6}$";

    private HtmlColorChecker() { }

    public static boolean check(String source) {
        Pattern ptr = Pattern.compile(HTML_COLOR_PATTERN);
        Matcher mtr = ptr.matcher(source);
        return mtr.matches();
    }

}
