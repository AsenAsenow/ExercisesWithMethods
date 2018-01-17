import java.util.Scanner;

public class MaxTwoNumbers {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());

        System.out.println(getMax(numberOne,numberTwo));

    }
    static int getMax(int numOne, int numTwo){
        int numMax = 0;
        if (numOne>numTwo){
            numMax=numOne;
        }else {
            numMax=numTwo;
        }
        return numMax;
    }


}
