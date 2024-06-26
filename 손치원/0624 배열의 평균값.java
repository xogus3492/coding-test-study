/*
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
*/
public class s_0620_05 {

    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            int sum = 0;
            for(int i=0; i<numbers.length; i++){
                
                sum += numbers[i];
                
            }
            {
                answer = (double)sum / numbers.length;
            }

            return answer;
        }
    }
}
//인트는 정수형 소수점 x  더블은 실수형 소수점 o
//i라는 변수를 선언하고 0으로 초기화
//i가 numbers 배열의 길이보다 작을 때까지 루프를 반복
//인덱스를 하나씩 증가
//배열 numbers의 i번째 원소(numbers[i])를 sum에 더한다
// 각 배열 원소를 순회하면서 sum에 누적하는 역할
