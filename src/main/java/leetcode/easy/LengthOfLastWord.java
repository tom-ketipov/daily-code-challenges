package leetcode.easy;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].trim().length();
    }
}
