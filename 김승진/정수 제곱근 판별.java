class Solution6 {
    //구글링 x
    public long solution(long n) {
        long answer = 0;
        long x = 1;

        for(long i=1; i<= n; i++){
            if(n/i == i){
                x = i;
            }
        }

        if(x * x == n){
            answer = (x+1) * (x+1);
        }else {
            answer = -1;
        }
        return answer;
    }


    //구글링o
    public long solution1(long n) {
        long answer = 0;
        //제곱근을 구해주는 함수()
        long x = (long)Math.sqrt(n);

        if(x * x == n){
            answer = (x+1) * (x+1);
        }else {
            answer = -1;
        }

        return answer;
    }
}
