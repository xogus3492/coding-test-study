/*
문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

*/
public class s_0620_01 {
    public static void main(String[] args) {

        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                if ((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000)) {
                    answer = num1 / num2;
                }
                return answer;
            }
        }
        System.out.printf("answer");
    }
}
