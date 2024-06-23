public class Solution_7 {
    public long solution(long n) {
        int x = 1;
        while ((long) x * x <= n) {
            if (x * x == n) {
                return (x + 1) * (x + 1);
            }
            x++;
        }
        return -1;
    }
}
