package cn.yk.practice.leetcode;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null)
            return 0;
        if (s.length()<=1)
            return s.length();
        
        
        return numDecodings(s.substring(0,s.length()-1))
                +(isEncodeMessage(s.substring(s.length()-2))?numDecodings(s.substring(0,s.length()-2)):0);
    }
    
    private boolean isEncodeMessage(String s){
        if (s.charAt(0)>'2')
            return false;
        if (s.charAt(0)=='2'&&s.charAt(1)>'6')
            return false;
        return true;
    }
    
    public static void main(String[] args) {
        DecodeWays d = new DecodeWays();
    
        System.out.println(d.isEncodeMessage("12"));
    }
}
