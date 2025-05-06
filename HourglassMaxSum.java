// https://www.hackerrank.com/challenges/2d-array/problem


class HourglassMaxSum {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here

        int n = 6;
        int m = 6;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n-2; i++) {
            for (int j=0; j<m-2; j++) {
                int tsum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                            + arr.get(i+1).get(j+1)
                            + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                
                max = Math.max(max, tsum);
            }
        }
        
        
        



        return max;
    }


    public static void main(String[] args) {
        
    }


}

    


