public class Solution_5 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int len = str.length();
        int[] answer = new int[len];

        for (int i = 0; i<len; i++){
            answer[i]   = Character.getNumericValue((str.charAt(len-1-i)));
        }
        return answer;
    }


}
