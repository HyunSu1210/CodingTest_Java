// 비트 연산자 이용
// 이런 풀이도 알아놓으면 좋을 듯!
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 비트 연산을 이용
            answer[i] = String.format("%" + n + "s", answer[i]); // 포맷팅을 해야 앞에 0이 나오는 경우 처리 가능
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        return answer;
    }
}