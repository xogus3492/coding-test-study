/*
문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
*/  
class Solution {
    public long solution(int a, int b) {    // 변수의 타입은 long 두 수의 합이 클 수 있기 때문에, 오버플로우를 방지하기 위함
        long answer = 0;
        
        if (a == b) {                      //a와 b가 같은 경우, 즉 a == b인 경우
            answer = a;
        } else if (a < b) {                  //a가 b보다 작은 경우, a부터 b까지의 모든 정수를 더한다
            for (int i = a; i <= b; i++) {   //for 반복문을 사용하여 i가 a부터 b까지 증가하면서 answer에 i를 더한다
                answer += i;                
            }
        } else {
            for (int i = b; i <= a; i++) {  //a가 b보다 큰 경우
                answer += i;
            }
        }
        return answer;
    }
}
