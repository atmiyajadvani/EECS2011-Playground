package IBM;


/**
 * Given a binary string consisting of characters '0's and '1', the following operation can be performed on it:
 *
 * Choose two adjacent characters, and replace both characters with their bitwise XOR value. For example, if binaryStr= "1100" and the first two characters are chosen, then after one operation, the string becomes binaryStr = "0000".
 *
 * The goal is to find the minimum number of operations needed to convert all characters of the string to '0'.
 *
 * Example:
 * Consider the given binary string to be binaryStr "101".
 *
 * An optimal sequence of operations is:
 * 1. Select the 1st and 2nd character, then binaryStr "111".
 * 2. Select the 1st and 2nd character, then binaryStr. "001".
 * 3. Select the 2nd and 3rd character, then binaryStr "011".
 * 4. Select the 2nd and 3rd character, then binaryStr "000".
 *
 * Optimally, all characters can be converted to 0 in 4 operations.
 *
 * Function Description:
 * Write JAVA code for the function getMinimumOperations which has the following parameters:
 * 1. string binaryStr which is the binary string
 * 2. Returns integer : minimum operations needed to convert all characters to 0
 */

public class BinaryString {

    public static int getMinimumOperations(String binaryStr) {
        int n = binaryStr.length();
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (binaryStr.charAt(i) != '0') {
                binaryStr = binaryStr.substring(0, i) + (char)(binaryStr.charAt(i) ^ '0' ^ '1') + binaryStr.substring(i+2);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int minOp = getMinimumOperations("101");
        System.out.println(minOp);
    }
}
