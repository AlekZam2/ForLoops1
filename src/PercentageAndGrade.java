import java.util.Scanner;

//Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//
//    Percentage >= 90% : Grade A
//    Percentage >= 80% : Grade B
//    Percentage >= 70% : Grade C
//    Percentage >= 60% : Grade D
//    Percentage >= 40% : Grade E
//    Percentage < 40% : Grade F
public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input marks for Physics");
        double grade1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Input marks for Chemistry");
        double grade2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Input marks for Biology");
        double grade3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Input marks for Mathematics");
        double grade4 = Double.parseDouble(scanner.nextLine());
        System.out.println("Input marks for Chemistry");
        double grade5 = Double.parseDouble(scanner.nextLine());

        double totalGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        System.out.println(" your total average marks: " + totalGrade);

        if (totalGrade >= 90) {
            System.out.println("Percentage >= 90% : Grade A");
        } else if (totalGrade >= 80) {
            System.out.println("Percentage >= 80% : Grade B");
        } else if (totalGrade >= 70) {
            System.out.println("Percentage >= 70% : Grade C");
        } else if (totalGrade >= 60) {
            System.out.println("Percentage >= 60% : Grade D");
        } else if (totalGrade >= 40) {
            System.out.println("Percentage >= 40% : Grade E");
        } else {
            System.out.println("Percentage < 40% : Grade F");
        }


    }
}
