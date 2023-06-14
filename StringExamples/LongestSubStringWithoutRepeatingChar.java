package StringExamples;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String st[]){
    System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        String longestSubString ="";
        for(int  i=0 ; i< s.length() ;i++){
            if(!longestSubString.contains(""+s.charAt(i))){
                longestSubString = longestSubString + s.charAt(i);
            } else {
                longestLength =  Math.max(longestSubString.length(), longestLength);
                longestSubString ="";
            }
        }
        return Math.max(longestSubString.length(), longestLength);
    }
}
