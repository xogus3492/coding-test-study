import java.util.*;

public class Solution3 {
    public int solution3(int n) {
        int answer = 0;
        // n을 문자열로 변환
        String a = Integer.toString(n);

        // String a 의 부분을 가져와서 int로 변환한 후 answer에 값을 더한다~
        // 배열이나 문자의 자리값을 구할 때는 for() 생각을 해보도록 하자.
        for(int i=0; i < a.length();i++){
            answer += Integer.parseInt(a.substring(i, i+1));
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
