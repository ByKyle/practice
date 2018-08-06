package cn.yk.practice.leetcode;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * click to show spoilers.
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 * Throw an exception? Good, but what if throwing an exception is not an option? You would then have to re-design the function (ie, add an extra parameter).
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();

        int[] a = {0,123,-123,1000000003,100};
        for (int integer:a) {
            System.out.println(r.reverse(integer));
        }

    }



//    public Long result;
//
//    public int reverse(int x) {
//        String y = null;
//        if (x >= 0) {
//            y = reverseString(Integer.toString(x));
//        } else {
//            y = "-" + reverseString(Integer.toString(Math.abs(x)));
//        }
//
//        try {
//            return Integer.parseInt(y);
//        } catch (Exception e) {
//            this.result = Long.parseLong(y);
//            return -1;
//        }
//    }
//
//    private String reverseString(String x) {
//        if (x.length() == 0) {
//            return "";
//        }
//        return reverseString(x.substring(1)) + x.substring(0, 1);
//    }
//
//    public static void main(String[] args) {
//        reverseInteger r = new reverseInteger();
//        int x = -1000000003;
//        int z = 0;
//        String y = "100000000312123123124312412431231233";
//        System.out.println(r.reverse(x));
//    }
}
