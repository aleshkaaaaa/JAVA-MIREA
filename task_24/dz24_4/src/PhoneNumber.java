import java.util.MissingFormatArgumentException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    private String code, a, b, c;

    public PhoneNumber(String code, String a, String b, String c) {
        this.code = code;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "+" + code + a + "-" + b + "-" + c;
    }

    public static PhoneNumber parse(String number) {
        Pattern pattern = Pattern.compile("^(\\+?)([0-9])([0-9]{3})([0-9]{3})([0-9]{4})$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            if (matcher.group(1).equals("+")) {
                return new PhoneNumber(
                        matcher.group(2),
                        matcher.group(3),
                        matcher.group(4),
                        matcher.group(5)
                );
            } else  {
                int code = Integer.parseInt(matcher.group(2)) - 1;
                return new PhoneNumber(
                        Integer.toString(code),
                        matcher.group(3),
                        matcher.group(4),
                        matcher.group(5)
                );
            }
        }
        throw new MissingFormatArgumentException("Number must match 10 digit with or without plus sign");
    }
}