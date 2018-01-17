import java.util.Scanner;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        int numberThree = Integer.parseInt(scan.nextLine());

        System.out.println(getMax(getMax(numberOne,numberTwo),numberThree));

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
