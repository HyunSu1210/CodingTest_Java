// long을 String 배열로 변환 후, 오름차순 정렬
// StringBuilder 선언 후, for문 이용해서 하나의 문자열로 변환
// long 타입으로 변환 후 리턴

import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split(""); // long 타입 n을 바로 String 배열에 넣을 수 없으니 문자열로 변환 후 쪼개기
        Arrays.sort(str, Collections.reverseOrder()); // 내림차순 정렬하는 방법
        
        StringBuilder sb = new StringBuilder();
        for(String str2 : str) { // 배열 str을 하나의 문자열로 통합
            sb.append(str2);
        }
        
        return Long.parseLong(sb.toString()); // sb를 Long 타입으로 변환;
    }
}