// 문자열 s의 길이만큼의 int 배열을 만든다
// 문자열 s를 순회하면서 0번부터 i번째에서 i번째 문자열이 몇번에 위치해 있는지 확인
// lastIndexOf(string s) 해당 문자열 인덱스 번호 줌. 없으면 -1


class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; // 문자열의 길이는 length()
        for(int i = 0; i < s.length(); i++) {
            if(i != 0) { // 첫번째 아닌 경우
                int idx = s.substring(0, i).lastIndexOf(s.charAt(i));
                if(idx != -1) { // 중복 있을 때
                    answer[i] = i - idx;
                } else { // 중복 없을 때
                    answer[i] = idx;
                }
            } else { // 첫번째는 무조건 -1
                answer[i] = -1;
            }
        }
        return answer;
    }
}