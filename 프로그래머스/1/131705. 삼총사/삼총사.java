class Solution {
    public int solution(int[] number) {
        int result = 0;
        for(int i = 0; i < number.length - 2; i++) {
            for(int j = i + 1; j < number.length - 1; j++) {
                for(int r = j + 1; r < number.length; r++) {
                    if(number[i] + number[j] + number[r] == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}