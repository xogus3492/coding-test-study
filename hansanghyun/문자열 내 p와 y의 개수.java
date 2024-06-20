//문제 설명
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//
//제한 조건
//s의 길이는 1 이상 5이하입니다.
//s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//s는 부호와 숫자로만 이루어져있습니다.
//s는 "0"으로 시작하지 않습니다.

class Solution {
    boolean solution(String s) {

        int cnt1 = 0;
        int cnt2 = 0;
        boolean answer = true;

        if (s.length() <= 50) {

            String str = s.toUpperCase();

            for (int i = 0; i < str.length(); i++) {

                if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {

                    if (str.charAt(i) == 'P') {
                        cnt1++;
                    } else if (str.charAt(i) == 'Y') {
                        cnt2++;
                    }

                    if (cnt1 == cnt2) {
                        answer = true;
                    } else {
                        answer = false;
                    }
                }
            }
        } else {
            System.out.println("조건에 맞게 다시 입력하세요");
        }
        return answer;
    }
}
