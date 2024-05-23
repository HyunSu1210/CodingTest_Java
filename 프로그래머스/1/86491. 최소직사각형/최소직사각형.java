class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0; // 가로
        int max_h = 0; // 세로
        
        for(int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]); // 가로 세로 중 더 긴 것을 가로에
            int min = Math.min(sizes[i][0], sizes[i][1]); // 더 짧은 것을 세로에

            
            // 가로 세로를 한묶음씩 비교
            
            max_w = Math.max(max_w, max); // 가장 긴 가로
            max_h = Math.max(max_h, min); // 가장 긴 세로
        }
        
        return max_w*max_h;
    }
}