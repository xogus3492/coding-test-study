class Solution2 {
    public int solution2(int n) {
        int answer = 0;

        //1~n까지 1씩 더하면서 나머지가 없으면 약수로 보고 answer에 더하기
        for(int i=1; i<= n; i++){
            if (n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
