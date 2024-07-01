//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ numbers의 길이 ≤ 9
//        0 ≤ numbers의 모든 원소 ≤ 9
//numbers의 모든 원소는 서로 다릅니다.

class Solution16 {
    public int solution(int[] numbers) {
        int answer = 0;
        int arr [] = new int[9];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        if (numbers.length>=1 && numbers.length<=9) {
            for (int i=0; i<numbers.length; i++) {
                if (numbers[i]>=0 && numbers[i]<=9) {
                    for (int j=0; j<arr.length; j++) {
                        if (arr[j] == numbers[i]) {
                            arr[j] = 0;
                        }

                    }
                }
            }
        }
        for (int i=0; i<arr.length; i++) {
            answer += arr[i];

        }
        return answer;
    }
}
