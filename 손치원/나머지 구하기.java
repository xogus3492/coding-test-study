/*
문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

*/

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if ((0< num1 && num1 <=100) &&
            (0< num2 && num2 <=100))   
        answer = num1 % num2;    //%는 나머지를 구하는거고 /는 몫을 구하는것이다.
        return answer;
    }
}
