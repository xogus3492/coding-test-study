// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
//
// 제한 조건
// x는 1 이상, 10000 이하인 정수입니다.

class Solution10 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int y = x;

        if (x>=1 && x<=10000) {
            while (x>0) {
                sum += x%10;
                x = x/10;
            }
            if (y % sum != 0) {
                answer = false;
            } else {
                answer = true;
            }
        }
        return answer;
    }
}
