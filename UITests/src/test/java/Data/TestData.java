package Data;

import org.apache.commons.lang3.RandomStringUtils;

public class TestData {

    public static String mailForAuthorization = "alistertvr@gmail.com";
    public static String passwordForAuthorization = "qwerty";

    public static String generateMail(){
        String firstMail = "alistertvr";
        String lastMail = "@gmail.com";
        return firstMail + "+" + RandomStringUtils.randomAlphanumeric(5) + lastMail;
    }

}
