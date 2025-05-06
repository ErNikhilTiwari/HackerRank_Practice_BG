// https://www.hackerrank.com/challenges/making-anagrams/problem


public class DeleteAnagram {

    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
            int[] freq=new int[26];
            
            for(char c:s1.toCharArray())
                freq[c-'a']++;
    
            for(char c:s2.toCharArray())
                freq[c-'a']--;
    
            int sum=0;
            
            for(int i=0; i<26; i++){
                sum += Math.abs(freq[i]);
            }
            
            
            return sum;
        }


}
