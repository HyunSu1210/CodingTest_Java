import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n % 10; // 일의 자리
            n /= 10; // 일의 자리 삭제
        }

        return answer;
    }
}