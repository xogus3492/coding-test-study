class Solution {
    public long[] solution(int x, int n) {
        //int n만큼의 배열 생성
        long[] answer = new long[n];
        //x는 -10000000 이상, 10000000 이하인 정수입니다.
        //혹시몰라서 long형 a 로 바꿔주고
        long a = x;
        
        //for 돌려서 long형 배열에 x값 넣고 i를 1씩 추가하면서 a*i값이 들어가도록 
        for(int i=0; i < n; i++){
            if(a != 0){
                answer[i] += a * (i+1);
            }
        }
        return answer;
    }
}
