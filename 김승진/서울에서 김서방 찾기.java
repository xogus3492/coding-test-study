class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String kim = "Kim";
        
        for(int i=0; i < seoul.length; i++){
            if(seoul[i].equals(kim)){
                int a = i; 
                answer = "김서방은 " + a + "에 있다";
            }
        }
        return answer;
    }
}
