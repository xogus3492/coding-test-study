//함수 solution은 정수 n을 매개변수로 입력받습니다.
//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//예를들어 n이 118372면 873211을 리턴하면 됩니다.
//제한 조건
//n은 1이상 8000000000 이하인 자연수입니다.

class Solution06 {
    public long solution(long n) {
        long answer = 0;
        if (n > 0 && n <= 8000000000L) {

            int temp = 0;
            String str = Long.toString(n);
            int len = str.length();
            int arr[] = new int[len];
            String ans = "";

            for (int i = 0; i < len; i++) {
                String s = str.substring(i, i + 1);
                arr[i] = Integer.parseInt(s);
            }

            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for (int i = 0; i < len; i++) {
                ans += arr[i];
            }
            answer = Long.parseLong(ans);

        } else {
            System.out.println("8,000,000,000이하의 자연수를 입력하세요");
        }

        return answer;
    }
}
