public class Solution03 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution03 so = new Solution03();
        int num1 = 6;
        int num2 = 4;

        System.out.println(num1-num2);
    }
}

// 정수 num1과 num2가 주어질 때, num1에서
// num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
