/*
문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
*/
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();  // divisor로 나누어 떨어지는 수를 저장할 ArrayList 생성

        for (int num : arr) {                         // 주어진 배열 arr을 순회하면서 divisor로 나누어 떨어지는 수를 list에 추가
            if (num % divisor == 0) {                 // num이 divisor로 나누어 떨어지면
                list.add(num);                        // list에 num을 추가
            }
        }
        if (list.isEmpty()) {                         // list에 요소가 없는 경우 -1 반환
            return new int[]{-1};        
        }
        int[] answer = new int[list.size()];          // list에 있는 요소들을 answer 배열에 저장
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);                  // list의 요소들을 answer 배열에 복사
        }
        Arrays.sort(answer);                          // answer 배열을 오름차순으로 정렬
        return answer;  
    }
}
