class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double sqrt = Math.sqrt(n); // 제곱근 구하기, sqrt가 x가 됨.
        if(sqrt % 1 == 0) {
            answer = (long) Math.pow(sqrt + 1, 2);
        }
        else answer = -1;
        
        return answer;
    }
}