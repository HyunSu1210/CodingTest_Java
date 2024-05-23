// 1. 리스트에 띄어쓰기로 단어를 구분하여 각각 저장 split(" ")
// 2. 각 리스트 순회하면서 단어의 짝/홀수 인덱스 판단해서 대소문자 변경
// toUpperCase() : 소문자로 변환 , toLowerCase() : 대문자로 변환

class Solution {
    public String solution(String s) {
        String answer = ""; // 합친 문장    
        int cnt = 0;
        String[] array = s.split("");
        
        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    
    }
}