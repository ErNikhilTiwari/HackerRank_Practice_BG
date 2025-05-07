import java.util.List;

// https://www.hackerrank.com/challenges/crush/problem

public class PerformQueryArray {
    
    // brute force approach
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
        long[] arr = new long[n];
        
        for(int i=0; i<queries.size(); i++) {
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k = queries.get(i).get(2);
            
            for(int j=a-1; j<b; j++) {
                arr[j] += k;
            }
        }
        
        long max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
    
        return max;
    }


    // optimized soulution
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
            long[] arr = new long[n + 2];
            
            
            for(int i=0; i<queries.size(); i++) {
                int a = queries.get(i).get(0);
                int b = queries.get(i).get(1);
                int k = queries.get(i).get(2);
                
                // for(int j=a-1; j<b; j++) {
                //     arr[j] += k;
                // }
                
                arr[a] += k;
                arr[b+1] -= k;   
            }
            
            
            
            long max = 0;
            long sum = arr[0];
            for(int i=1; i<n+1; i++) {
                sum += arr[i];
                max = Math.max(max, sum);
            }
        
            return max;
        
    
    }



    

}
