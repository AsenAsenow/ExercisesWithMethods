import java.util.Scanner;

public class NthDigitFind {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int index = Integer.parseInt(scan.nextLine());

        System.out.println(findNthDigit(number,index));
    }

    static int findNthDigit (int number, int index) {

        int result = 0;

        int dividerResult = 0;
        while (index!=1){
           number=number/10;
            index--;
        }
        dividerResult=number%10;

        return dividerResult;
    }
}
