

// https://www.hackerrank.com/challenges/two-strings/problem

public class TwoString {

    
    public static String twoStrings(String s1, String s2) {
        // Write your code here
    
            int[] freq = new int[26];
            
            // int n = Math.min(s1.length(), s2.length());
            
            for(char c:s1.toCharArray()) {
                freq[c-'a']++;
            }
            
            for(char c:s2.toCharArray()) {
                if(freq[c-'a'] > 0){
                    return("YES");
                }
            }
    
            return("NO");
    
        }
}
