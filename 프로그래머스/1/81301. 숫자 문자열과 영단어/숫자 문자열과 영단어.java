class Solution {
    public int solution(String s) {
        String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // 인덱스 번호와 숫자가 일치한다.
        for(int i = 0; i < array.length; i++) {
            if(s.contains(array[i])) { // 문자열 s에 해당 문자열 포함되어 있는지 여부
                s = s.replace(array[i], Integer.toString(i)); // A를 B로 바꾸기. array[i]를 i로 바꾸기
            }
        }
        return Integer.parseInt(s);
    }
}