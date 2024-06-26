class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        
        long answer_2 = x;
        
        for(int i=0; i< n; i++){
            answer[i]=answer_2;
            answer_2 += x;
        }
        return answer;
    }
}
