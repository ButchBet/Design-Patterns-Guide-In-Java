package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tools {
    public Tools() {}
    
    public boolean isAPhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 10 && phoneNumber.startsWith("3") && isALong(phoneNumber);
    }
    
    public boolean isALong(String phoneNumber) {
        try {
            Long.parseLong(phoneNumber);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
