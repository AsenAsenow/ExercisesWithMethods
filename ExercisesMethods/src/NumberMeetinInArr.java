import java.util.Scanner;

public class NumberMeetinInArr {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter repetitive number:");
        int numb = Integer.parseInt(scan.nextLine());
        System.out.println("Enter size on arrey:");
        int size = Integer.parseInt(scan.nextLine());
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            int currenNumber = Integer.parseInt(scan.nextLine());
            number[i]=currenNumber;
        }

        System.out.printf("The number %d meeting %d times!!!",numb,meetNumber(number,numb));
    }

    static int meetNumber(int[] arr, int num){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                counter+=1;
            }
        }
        return counter;
    }
}
