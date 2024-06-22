import java.util.*;

public class Solution4 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);    //int n 을 String 으로 변환
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i,i+1)); // 문자열을 정수로 변환
            }

        return answer;
    }
}
