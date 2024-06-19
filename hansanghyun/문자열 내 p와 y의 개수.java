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
