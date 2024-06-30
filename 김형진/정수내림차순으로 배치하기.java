
public class Solution_6 {
    public long solution(long n) {

        String str = String.valueOf(n);
        Character[] digits = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i);
        }

        Arrays.sort(digits, (a, b) -> Character.compare(b, a));


        StringBuilder sb = new StringBuilder();
        for (Character digit : digits) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }
}
