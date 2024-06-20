public class Day_1_2 {
    public static int solution(String s) {

        if (!s.isEmpty() && s.length() <= 5) {

            if (s.matches("[+-]?\\d+")) {
                return Integer.parseInt(s);

            } else {
                throw new IllegalArgumentException("문자열은 부호(+,-)와 숫자로만 구성되어야 합니다.");
            }
        } else {
            throw new IllegalArgumentException("문자열의 길이는 1 이상 5 이하이어야 합니다.");
        }
    }

    public static void main(String[] args) {

        System.out.println(solution("1234"));  // 출력: 1234
        System.out.println(solution("-1234")); // 출력: -1234
        System.out.println(solution("+123"));  // 출력: 123

    }
}
