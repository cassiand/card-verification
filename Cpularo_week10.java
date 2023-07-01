package cpularo_week10;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Cassian Pularo
 * @Assignment Name: cpularo_week10
 * @Date: Nov 18, 2022
 * @Description: main class, checks if credit card number is valid by calling
 * subclass VerifyCard method
 */
//Imports
import java.util.Scanner;

//Begin Class Cpularo_week10
public class Cpularo_week10 {
//Begin Main Method

    public static void main(String[] args) {

        String choice;
        do {
            /* declare scanner object */
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Card Holder's Name: ");
            String userName = sc.nextLine();
            System.out.print("Enter credit card number (no dashes): ");

            String userCard = sc.nextLine();

            /* replace any dashes from the card number */
            String cardNum = userCard.replaceAll("-", "");
            /* split card number by each number and add to array of strings */
            String[] cardArr = cardNum.split("");
            /* create int array the same size as the string array */
            int[] cardNumArr = new int[cardArr.length];

            /* iterate through string array, adding to int array*/
            for (int i = 0; i < cardArr.length; i++) {
                cardNumArr[i] = Integer.parseInt(cardArr[i]);
            }

            System.out.print("Enter credit card expiration date (MM/YY): ");
            String userDate = sc.nextLine();
            /* replace any slashes in input */
            String userExp = userDate.replaceAll("/", "");
            /* split string, adding each element to array */
            String[] expArray = userExp.split("");
            /* create int array of same length as expArray */
            int[] expDateArray = new int[expArray.length];
            /* iterate through expArray, adding each element to new array */
            for (int i = 0; i < expArray.length; i++) {
                expDateArray[i] = Integer.parseInt(expArray[i]);
            }

            /* assign bool var to check card method from subclass*/
            boolean cardVer = VerifyCard.checkCard(expDateArray, cardNumArr);

            if (cardVer == true) {
                System.out.printf("Card number: %s is a valid credit card.\n", 
                        cardNum);
            } else {
                System.out.printf("Card number: %s is NOT a valid credit card.\n", 
                        cardNum);
            }

            System.out.print("Run program again? (Y for Yes, N for No):");
            choice = sc.next();
        } /* as long as user says yes to running again */ while 
                (choice.equalsIgnoreCase("y"));
        System.out.println("Thank you. Goodbye!");

    } //End Main Method
} //End Class Cpularo_week10
