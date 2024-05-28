import java.util.*;

// sort와 substring 이용하기
// 첫 글자를 index의 요소, strings의 요소를 합친 값을 list로 저장 후 정렬.
// answer 배열에 substring(1) 함수를 사용하여 첫 글자를 제외한 문자를 저장
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]); // 첫 글자에 합친 후 정렬
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}