class Solution5 {
    public long solution(long n) {
        String a = Long.toString(n);
        char[] aArray = a.toCharArray();
        Arrays.sort(aArray);

        long[] answer = new long[aArray.length];

        for(int i=0; i < aArray.length; i++){
            answer[i] = aArray[aArray.length - 1 - i] - '0';
        }

        return answer;
    }


    public long solution1(long n) {
        // 숫자를 문자열로 변환하여 각 자리 숫자 배열로 만듦
        String[] arr = String.valueOf(n).split("");

        // 오름차순 정렬
        Arrays.sort(arr);

        // 정렬된 문자열을 역순으로 합치기
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        // 문자열을 long으로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}
