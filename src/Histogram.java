import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;

        for (int i = 0; i < n; i++) {

            int currentValue = Integer.parseInt(scanner.nextLine());
            if (currentValue < 200){
                countP1++;
            } else if (currentValue < 400 ) {
                countP2++;

            } else if ((currentValue < 600 )) {
                countP3++;
            } else if (( currentValue < 800)) {
                countP4++;

            } else{
                countP5++;
            }


        }
        double P1 = countP1 * 1.0 / n * 100;
        double P2 = countP2 * 1.0 / n * 100;
        double P3 = countP3 * 1.0 / n * 100;
        double P4 = countP4 * 1.0 / n * 100;
        double P5 = countP5 * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", P1);
        System.out.printf("%.2f%%%n", P2);
        System.out.printf("%.2f%%%n", P3);
        System.out.printf("%.2f%%%n", P4);
        System.out.printf("%.2f%%%n", P5);

    }
}
