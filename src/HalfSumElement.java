import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if( maxNumber < currentNumber){
                maxNumber = currentNumber;
            }

        }
        int sumWithoutMaxNumber = Math.abs (sum - maxNumber);

        if ( sumWithoutMaxNumber == maxNumber){
            System.out.println( "Yes " + sum);
        }else {

            System.out.println("No, the difference is " + diff);
        }


    }
}
