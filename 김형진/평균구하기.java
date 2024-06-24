public class Solution{
    public double solution(int[] arr) {


        double answer_2=0;

        for(int i=0;i<arr.length; i++){
            answer_2 +=arr[i];

        }

        double answer = answer_2/arr.length;
        return answer;
    }
}
