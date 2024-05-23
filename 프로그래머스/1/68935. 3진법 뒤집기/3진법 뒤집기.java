class Solution {
    public int solution(int n) {
        String str = "";
        
        while(n != 0) {
            str += n % 3; // n을 3으로 나눈 나머지를 str에 더한다. -> 자동 뒤집기
            n /= 3; // 다음 연산을 위해 3을 나눈 몫을 저장한다.
        }
        
        return Integer.parseInt(str, 3); // str을 3진법으로 해석하고, 10진법으로 변환한다.
    }
}