class Solution {
    public boolean solution(int x) {

        String str = String.valueOf(x);
        int answer_2 =0; 

        for(int i=0; i<str.length(); i++){
            answer_2 += Character.getNumericValue(str.charAt(i));
        }
            if(x%answer_2==0){

                return true;

        }
       else{
             return false;

       }
    }
}
