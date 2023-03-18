package IBM;
import java.util.Stack;

/**
 * Given a string seq consisting of the characters 'A' and 'B' only, in one move, you can delete either an''AB" or "BB"
 * substring. After a move, the remaining parts of the string get concatenated.
 *
 * Find the minimum possible length of the remaining string after performing any number of moves.
 *
 * Note: A substring is a contiguous subsequence of a string.
 *
 * Example:
 * seq = "BABBA"
 *
 * Using 0-based indexing, the following moves are optimal.
 * - Delete the substring "AB" starting at index 1. "BABBA" -> "BBA"
 * - Delete the substring "BB" starling at index 0. "BBA" -> "A"
 *
 * There are no more moves so the minimum possible length of the remaining string is 1.
 *
 * Function Description:
 * Write JAVA code for the function getminLength which has the following parameter(s):
 * 1. string 'seq' which is the string
 * 2. Returns int the minimum possible length of the remaining string
 */
public class MinLength {

    public static int getminLength(String seq) {
        Stack<Character> stack = new Stack<>();
        for (char c : seq.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == 'A' && c == 'B') {
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() == 'B' && c == 'B') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }



    public static void main(String[] args) {
        int minLength = getminLength("BABBA");
        System.out.println(minLength);
    }

}
