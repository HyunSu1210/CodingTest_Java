import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> temp_arr = new ArrayList<Integer>(); // 리스트 선언
        for(int i = 0; i < arr.length; i++) { // 배열 arr의 길이만큼 순환
            if(i == 0) { // 만약, i가 가장 처음이면
                temp_arr.add(arr[i]); // 리스트 temp_arr에 삽입
            } else { // 2번째부터는
                if(arr[i] != arr[i-1]) { // 다음 수가 이전 수와 다른 경우에만 삽입
                    temp_arr.add(arr[i]);
                }
            }
        }
        
        int[] answer = new int[temp_arr.size()];
        for(int j = 0; j < temp_arr.size(); j++) {
            answer[j] = temp_arr.get(j);
        }
        
            
            return answer; 
        }

      
    }
