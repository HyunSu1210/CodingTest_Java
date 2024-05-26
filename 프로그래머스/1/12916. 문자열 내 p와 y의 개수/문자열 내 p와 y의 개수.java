class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String[] array = s.split("");
        for(String ss : array) {
            if(ss.equalsIgnoreCase("p")) {
                p++;
            } else if(ss.equalsIgnoreCase("y")) {
                y++;
            }
        }
        if (p != y) {
            answer = false;
        }
        return answer;
    }
}