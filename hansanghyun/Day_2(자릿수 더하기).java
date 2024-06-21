//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
//
//제한사항
//N의 범위 : 100,000,000 이하의 자연수

public class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n>0 && n<=100000000) {

            for (int i=8; i>=0; i--) {
                answer += n / (int)Math.pow(10, i);
                n = n % (int)Math.pow(10, i);
            }
        } else {
            System.out.println("100,000,000이하의 자연수를 입력하세요.");
        }
        return answer;
    }
}
