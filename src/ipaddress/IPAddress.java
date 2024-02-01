package ipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {

    public static boolean regEx(String ip) {

        Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher mtch = ptn.matcher(ip);
        return mtch.find();
    }

    public static void main(String[] args) {

        System.out.println("127.0.0.1 " + IPAddress.regEx("127.0.0.1"));
        System.out.println("255.255.255.253 " + IPAddress.regEx("255.255.255.253"));
        System.out.println("100.99.44.2 " + IPAddress.regEx("100.99.44.2"));
        System.out.println("100.33.45 " + IPAddress.regEx("100.33.45"));
    }
}


