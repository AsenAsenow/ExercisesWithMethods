import java.util.Scanner;

public class LastNumberToString {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = Integer.parseInt(scan.nextLine());
        lastNumber(num);
    }

    static int lastNumber(int number){
        int lastNum=0;
        if (number>9) {
            int i = number % 10;
            lastNum=i;
        }
        switch (lastNum){
            case 1:
                System.out.print("One"); break;
            case 2:
                System.out.print("Two"); break;
            case 3:
                System.out.print("Three"); break;
            case 4:
                System.out.print("Four");break;
            case 5:
                System.out.print("Five");break;
            case 6:
                System.out.print("Six"); break;
            case 7:
                System.out.print("Seven"); break;
            case 8:
                System.out.print("Eight"); break;
            case 9:
                System.out.print("Nine");break;
            case 0:
                System.out.print("Zero");break;

        }
     return lastNum;
    }
}
