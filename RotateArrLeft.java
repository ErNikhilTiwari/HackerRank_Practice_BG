import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/array-left-rotation/problem

public class RotateArrLeft {
    
     public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here

        if (arr.size() == 1) {
            return arr;
        }
        
        for(int i=0; i<d; i++) {
            if (arr.size() == 2) {
                int temp = arr.get(0);
                arr.set(arr.size()-1, temp);
                return arr;
            }
            int temp = arr.get(0);
            for(int j=0; j<arr.size()-1; j++) {
                int t = arr.get(j+1);
                arr.set(j, t);
            }
        arr.set(arr.size()-1, temp);
        }
        
        
        return arr;
        
    }


        public static List<Integer> rotateLeft1(int d, List<Integer> arr) {
    // Write your code here

        List<Integer> ans = new ArrayList<>();
        
        ans.addAll(arr.subList(d, arr.size()));
        
        ans.addAll(arr.subList(0, d));
        
        return ans;   
    }




}


