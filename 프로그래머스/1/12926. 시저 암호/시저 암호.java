// 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸기
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수

// 아스키 코드

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // ch에는 해당 문자가 들어감
            System.out.println("ch : " + ch);
            if(Character.isLowerCase(ch)) { // 소문자
                ch = (char) ((ch - 'a' + n) % 26 + 'a');

            } else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');

            }
            answer += ch;
        }
        return answer;
}
}