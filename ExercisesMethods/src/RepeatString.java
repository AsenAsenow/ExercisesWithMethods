
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int repeat = Integer.parseInt(scan.nextLine());
        String str = scan.nextLine();

        System.out.println(repeatStr(str,repeat));
    }

    static String repeatStr (String str, int repeate){

        return new String(new char[repeate]).replace("\0", str);

    }

}
