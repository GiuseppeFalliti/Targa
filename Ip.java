
/**
 * 4ci 4ca 4ci = california(2000luca2000) 
 */

import java.util.regex.Pattern;
import java.util.Scanner;

public class Ip {
    public static void targa() {
        String targa = "AA001BF";

        String regex = "[A-Z]{2}[0-9]{3}[A-Z]{2}";

        if (Pattern.matches(regex, targa)) {
            System.out.println("Targa corretta");
        } else {
            System.out.println("Targa errata");
        }

        targa = "AA0T1BF";

        if (Pattern.matches(regex, targa)) {
            System.out.println("Targa corretta");
        } else {
            System.out.println("Targa errata");
        }
    }

    public static void targaCalifornia(String targa) {
        String regex = "[0-9]{4}[A-Z|a-z]{4}[0-9]{4}";
        if (Pattern.matches(regex, targa)) {
            System.out.println("targa corretta");

        } else {
            System.out.println("targa errata");
        }

    }

    public static void ip(String address) {
        String ipValidate = "192.168.(25[0-5]|2[0-4]\\d|1\\d\\d|[0-9]\\d|\\d).(25[0-5]|2[0-4]\\d|1\\d\\d|[0-9]\\d|\\d)";
        if (Pattern.matches(ipValidate, address)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci la ip:");
        String targa = sc.nextLine();
        ip(targa);

    }
}
