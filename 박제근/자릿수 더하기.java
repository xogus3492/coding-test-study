public class Solution_3_0621 {
    public int solution(int n) {
        int answer = 0;
        String m = n+"";

        if(n<=100000000){
            for(int i=0; i < m.length(); i++){
                char x = m.charAt(i);
                answer += Integer.parseInt(String.valueOf(x));
            }
        }
        return answer;
    }
}
