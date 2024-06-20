//문제 설명
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
//
//제한 조건
//s의 길이는 1 이상 5이하입니다.
//s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//s는 부호와 숫자로만 이루어져있습니다.
//s는 "0"으로 시작하지 않습니다.

class Solution {
    public int solution(String s) {
        int sol = 0;

        if (s.length() >= 1 && s.length() <= 5) {
            // +, - 의 아스키 코드 십진법은 43, 45 / 앞자리는 0 불가
            if ((int) s.charAt(0) == 43 || (int) s.charAt(0) == 45 || ((int) s.charAt(0) >= 49 && (int) s.charAt(0) <= 57)) {
                for (int i = 1; i < s.length(); i++) {
                    if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                        sol = Integer.parseInt(s);
                    } else {
                        System.out.println("숫자 형식을 확인하세요");
                    }
                }
            } else {
                System.out.println("첫글자가 0입니다");
            }
        } else {
            System.out.println("길이를 확인하세요");
        }
        return sol;
    }
}
