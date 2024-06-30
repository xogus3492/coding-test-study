class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count1 = 0;
        int count2 = 0;

        char[] sArray = s.toCharArray();

        for(int i=0; i<sArray.length; i++) {
            if(sArray[i] == 'p' || sArray[i] == 'P') {
                count1++;
            } else if (sArray[i] == 'y' || sArray[i] == 'Y') {
                count2++;
            }
        }
        return answer;
    }
}
