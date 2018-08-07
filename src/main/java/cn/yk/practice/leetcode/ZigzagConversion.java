package cn.yk.practice.leetcode;

/**
 * The string"PAYPALISHIRING"is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line:"PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3)should return"PAHNAPLSIIGYIR".
 */
public class ZigzagConversion {
    public String convert(String s, int nRows) {
        int maxLength = s.length();
        if (maxLength == 0 || maxLength ==1||nRows<=1)
            return s;
        int segment = (nRows << 1) - 2;
        int currentIndex = 0;
        char[] result = new char[maxLength];
        for (int row = 0; row < nRows; row++) {
            for (int i = row; i < maxLength; i += segment) {
                result[currentIndex++] = s.charAt(i);
                if (row != 0 && row != nRows - 1 && i + segment - 2 * row < maxLength) {
                    result[currentIndex++] = s.charAt(i + segment - 2 * row);
                }
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        ZigzagConversion z = new ZigzagConversion();
        System.out.println(z.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
    }
}
