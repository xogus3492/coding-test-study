/*
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
*/
import java.util.HashSet;  //hashSet을 사용하여 정수형 데이터를 저장할 set을 생성합니다. HashSet은 중복된 값을 허용하지 않고, 추가된 순서대로 저장

class Solution {
    public int solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {              //set에는 numbers 배열에 포함된 숫자들만 남게 됩니다.
            set.add(num);
        }
        int answer = 0;
        for (int i = 0; i <= 9; i++) {       //0부터 9까지의 숫자를 순회하면서 set에 포함되지 않은 숫자들의 합을 계산
            if (!set.contains(i)) {          //set에 숫자 i가 포함되어 있는지 검사하고, 포함되지 않은 경우 answer에 i를 더합니다.
                answer += i;
            }
        }   
        return answer;
    }
}
