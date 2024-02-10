package ipaddress;

public class IPAddress {

    public static boolean regEx(String input) {
        return input.matches("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
    }

    public static void main(String[] args) {
        System.out.println("127.0.0.1 " + IPAddress.regEx("127.0.0.1"));
        System.out.println("255.255.255.253 " + IPAddress.regEx("255.255.255.253"));
        System.out.println("100.99.44.2 " + IPAddress.regEx("100.99.44.2"));
        System.out.println("100.33.45 " + IPAddress.regEx("100.33.45"));
    }
}


