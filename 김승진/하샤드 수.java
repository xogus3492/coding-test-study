class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // int를 String 배열로 변환
        String[] arr = String.valueOf(x).split("");
        int a = 0;
        int b = 0;

        //for 돌려서 인덱스[i] 수를 int로 변환하여 a로 만들고 b에 값 더하기
        for(int i=0; i < arr.length; i++){
            a = Integer.parseInt(arr[i]);
            b += a;
        }
        
        //짝수 홀수 구하기
        if(x % b == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
