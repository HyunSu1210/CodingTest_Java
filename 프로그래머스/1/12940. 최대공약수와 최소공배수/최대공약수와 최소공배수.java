class Solution {
    public int[] solution(int n, int m) {
        int array[] = new int[2];
        int max, min;
        
        if(n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        int gcd = getGCD(max, min);
        array[0] = gcd;
        array[1] = (max * min) / gcd;
        return array;
    }
    
    public static int getGCD(int max, int min) {
        if(max % min == 0) {
            return min;
        }
        return getGCD(min, max%min);
    }
}