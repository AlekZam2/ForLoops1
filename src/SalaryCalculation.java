import java.util.Scanner;
//Write a program to calculate the salary as per the following table
//Gender 	Year of Service 	Qualifications 	Salary
//Male 	>= 10 	Post - Graduate 	15000
//>= 10 	Graduate 	10000
//< 10 	Post - Graduate 	10000
//< 10 	Graduate 	7000
//Female 	>= 10 	Post - Graduate 	12000
//>= 10 	Graduate 	9000
//< 10 	Post - Graduate 	10000
//< 10 	Graduate 	6000
public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print(" Enter education: ");
        String education = scanner.nextLine();

        System.out.print(" Enter years of experience: ");
        int yearsOfEx = Integer.parseInt(scanner.nextLine());

        if ( (gender.equals("male") && yearsOfEx >= 10 && education.equals("Graduate")) || (gender.equals("male") && yearsOfEx < 10 && education.equals("Post - Graduate")) || (gender.equals("female") && yearsOfEx < 10 && education.equals("Post - Graduate")) ){
            System.out.println( "Your salary per year is; 10,000£ " );
        } else if (gender.equals("male") && yearsOfEx >= 10 && education.equals("Post - Graduation")) {
            System.out.println("Your salary per year is; 15,000£ ");
        } else if (gender.equals("male") && yearsOfEx < 10 && education.equals("Graduation")) {
            System.out.println("Your salary per year is; 7000£");
        }else if(gender.equals("female") && yearsOfEx >= 10 && education.equals("Post - Graduation")){
            System.out.println("Your salary per year is; 12,000£ ");
        } else if (gender.equals("female") && yearsOfEx >= 10 && education.equals("Graduation")) {
            System.out.println("Your salary per year is; 9,000£");
        }else{
            System.out.println("Your salary per year is; 6,000£");
        }


    }
}