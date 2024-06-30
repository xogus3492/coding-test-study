//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//제한 조건
//n은 10,000,000,000이하인 자연수입니다.

class Solution05 {
    public int[] solution(long n) {
        int len = Long.toString(n).length();
        int[] answer = new int[len];
        int i=0;

        if (n<=10000000000L) {
            while (n>0) {
                answer[i] = (int) (n % 10);
                n = n/10;
                i++;
            }
        } else {
            System.out.println("10,000,000,000이하의 숫자를 입력하세요");
        }
            return answer;
    }
}
