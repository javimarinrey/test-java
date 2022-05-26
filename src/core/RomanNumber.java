package core;

import utils.UtilsNumber;

public class RomanNumber {
    public static void main(String[] args) {
        for (int n = 1; n <= 4999; n++) {
            String roman = UtilsNumber.toRoman(n);
            int number = UtilsNumber.toNumber(roman);

            System.out.println(number + " = " + roman);
        }
    }
}
