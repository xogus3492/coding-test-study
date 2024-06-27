/*
문제 설명
어떤 정수들이 있습니다. 
이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
*/
   class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i =0; i<absolutes.length; i++)
        {   // for문을 돌리며 삼항연산자를 사용
            answer += (signs[i] == true) ? absolutes[i] : -absolutes[i];
            //+=는 복합 할당 연산자
            //signs 배열의 i번째 요소가 true인 경우 absolutes[i] 값을 그대로 더한다.
            //signs 배열의 i번째 요소가 false인 경우 absolutes[i] 값을 음수로 바꿔 더한다.
        }
        return answer; // 반환 값을 answer에 더해준다.
    }
}
