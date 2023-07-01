package cpularo_week10;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Cassian Pularo
 * @Assignment Name: cpularo_week10
 * @Date: Nov 18, 2022
 * @Subclass VerifyCard Description: contains methods to check conditions of cc#
 */
//Imports
//Begin Subclass VerifyCard
public class VerifyCard extends Cpularo_week10 {

    /**
     * method conditionOne: checks if first digit in card number == 4
     *
     * @param array
     * @return Boolean, true or false
     */
    private static boolean conditionOne(int[] array) {
        /* check if first digit in regex string arr is 4 */
        return array[0] == 4;
    }

    /**
     * method conditionTwo: checks if 4th digit is 1 greater than 5th digit
     *
     * @param array
     * @return Boolean, true or false
     */
    private static boolean conditionTwo(int[] array) {
        /* check if 4th digit is 1 more than 5th digit */
        return array[3] - array[4] == 1;
    }

    /**
     * method conditionThree: checks if product of 1st, 5th, 9th elements == 24
     *
     * @param array
     * @return Boolean, true or false
     */
    private static boolean conditionThree(int[] array) {
        /* check if product of 1st, 5th, 9th digits == 24 */
        return array[0] * array[4] * array[8] == 24;
    }

    /**
     * method conditionFour: check if sum of all card number digits is evenly
     * divisible by 4
     *
     * @param array
     * @return Boolean, true or false
     */
    private static boolean conditionFour(int[] array) {
        /* declare variables to use */
        int sum = 0;
        int i;
        /* iterate through array, adding each element*/
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        /* check if sum is evenly divisible by 4 */
        return sum % 4 == 0;
    }

    /**
     * method conditionFive: checks if sum of exp date digits is less than last
     * 2 digs in card number
     *
     * @param expArray
     * @param numArray
     * @return Boolean, true or false
     */
    private static boolean conditionFive(int[] expArray, int[] numArray) {
        /* declare variables to use*/
        int sum = 0;
        int i;
        /* iterate through exp date array, adding each element*/
        for (i = 0; i < expArray.length; i++) {
            sum += expArray[i];
        }
        /* multiply last 2 elements of card num array */
        int product = numArray[14] * numArray[15];
        /* check if sum < the product */
        return sum < product;
    }

    /**
     * method conditionSix: checks if first 4 digits is 1 less than last 4
     * digits
     *
     * @param array
     * @return Boolean, true or false
     */
    private static boolean conditionSix(int[] array) {
        /* initialize and declare variables */
        int sum1 = 0;
        int sum2 = 0;
        int i;
        int j;
        /* get sum of first 4 digits in array */
        for (i = 0; i < 4; i++) {
            sum1 += array[i];
        }
        /* get sum of last 4 digits in array */
        for (j = 12; j < array.length; j++) {
            sum2 += array[j];
        }
        /* check if sum1 is 1 less than sum2 */
        return sum1 + 1 == sum2;
    }

    /**
     * method checkCard: public method called to check if all priv methods are
     * true
     *
     * @param expArray
     * @param numArray
     * @return Boolean, true or false
     */
    public static boolean checkCard(int[] expArray, int[] numArray) {
        return conditionOne(numArray) == true && conditionTwo(numArray)
                == true && conditionThree(numArray)
                == true && conditionFour(numArray) == true
                && conditionFive(expArray, numArray)
                == true && conditionSix(numArray) == true;
    }

} //End Subclass VerifyCard
