import java.util.Scanner;
//A certain grade of steel is graded according to the following conditions
//
//    Hardness must be greater than 50
//    Carbon content must be less than 0.7
//    Tensile strength must be greater than 5600
//
//The grades are as follows:
//
//    Grade is 10 if all three conditions are met
//    Grade is 9 if conditions (i) and (ii) are met
//    Grade is 8 if conditions (ii) and (iii) are met
//    Grade is 7 if conditions (i) and (iii) are met
//    Grade is 6 if only one condition is met
//    Grade is 5 if none of the conditions are met
//
//Write a program, which will require the user to give values of hardness, carbon content and tensile strength of the steel under consideration and output the grade of the steel
public class SteelCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter carbon amount: ");
        double carbon = Double.parseDouble(scanner.nextLine());

        System.out.print(" Enter hardness level: ");
        double hardness = Double.parseDouble(scanner.nextLine());
        System.out.print(" Enter tensile level: ");
        double tensile = Double.parseDouble(scanner.nextLine());


        if(carbon < 0.7 && hardness > 50 && tensile > 5600){
            System.out.println("Grade");
        } else if (hardness > 50 && carbon < 0.7) {
            System.out.println("Grade 9");
        }else if (carbon < 0.7 && tensile > 5600){
            System.out.println("Grade 8");
        }else if(hardness > 50 && tensile > 5600 ){
            System.out.println("Grade 7");
        }else if (carbon < 0.7 || hardness > 50 || tensile > 5600){
            System.out.println("Grade 6");
        }else {
            System.out.println("Grade 5");
        }
    }

}



