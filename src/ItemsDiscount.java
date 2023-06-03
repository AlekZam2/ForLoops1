import java.util.Scanner;
//while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100. If quantity and price per item are input through the keyboard, write a program to calculate the total expenses
public class ItemsDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print(" Enter item price: ");
        double itemPrice = Double.parseDouble(scanner.nextLine());

        System.out.print(" Enter item amount: ");
        int itemsAmount = Integer.parseInt(scanner.nextLine());

        double finalAmountPrice = itemsAmount * itemPrice;

        if( itemsAmount >= 100){
            finalAmountPrice = finalAmountPrice - (finalAmountPrice * 0.10);

        }
        System.out.println("The total is: " + finalAmountPrice);

    }
}
