public class Solution_3 {
    public int solution(int n) {
        if (n<0||n>3000){
            System.out.println("n이 범위조건에 부합하지 않습니다");
        }
        int answer = 0;

        for(int i =1;i<=n; i++){
            if (n%i==0){
            answer +=i;
            }
        }
        return answer;
    }
}
