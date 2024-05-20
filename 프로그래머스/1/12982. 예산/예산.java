// 부서별로 물품을 구매하는데 필요한 금액 조사
// 전체 예산이 정해져있기 때문에 모든 부서의 물품 구매 불가
// 최대한 많은 부서의 물품 구매!!
// 물품 구매는 각 부서가 신청한 금액만큼을 모두 지원해야 함
// 부서별로 신청한 금액이 들어있는 배열 d, 예산 budget
// 최대 몇개 부서에 물품 지원할 수 있는지 return
// 전체 부서의 개수(d의 길이)는 1이상 100이하
// d의 각 원소는 부서별로 신청한 금액으로, 1이상 100000이하
// budget은 예산을 나타내며, 1이상 10000000이하


import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // + 1. 정렬을 해줌!!!
        int result = 0;
        for(int i = 0; i < d.length; i++) { // 2. 부서별 신청 금액을 순회해야 함
            if(budget >= d[i]) { // 3. 남은 예산이 다음 부서가 신청한 금액보다 크거나 같아야 지원
                budget -= d[i];
                result++;
                }
            }
        return result;
        }
        
    }
