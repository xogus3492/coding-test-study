class Solution4 {
    public int[] solution(long n) {

        //문자열로 변환
        String a = Long.toString(n);
        //문자 배열로 변환
        char[] aArray = a.toCharArray();

        //answer 배열을 aArray 배열 길이만큼의 길이로 생성
        int[] answer = new int[aArray.length];

        //for 돌려서 aArray 길이에서 0부터 뺴면서 저장 (- '0' 는 구글링, 아스키 코드로 계산)
        for(int i=0; i < aArray.length; i++){
            answer[i] = aArray[aArray.length - 1 - i] - '0';
        }
        return answer;
    }
}
