// 1. p의 문자열 길이 구해서 변수에 담기 s = p.length
// 2. for문 이용해서 문자열 자르기. i는 시작 위치가 됨
// 3. 잘라진 문자열 대소 비교해서 작거나 같으면 result++

class Solution {
    public int solution(String t, String p) {
        int s = p.length(); // p의 문자열 길이 구하기
        Long longP = Long.parseLong(p); // 대소 비교 위해 p를 int형으로 변환
        int result = 0;
        
        for(int i = 0; i < t.length() - s + 1; i++) {
            String strT = t.substring(i, s + i); // 자를 위치 지정
            Long longT = Long.parseLong(strT); // 대소 비교 위해 자른 t를 int형으로 변환
            if(longT <= longP) {
                result++;
            }
        }
        return result;
    }
}