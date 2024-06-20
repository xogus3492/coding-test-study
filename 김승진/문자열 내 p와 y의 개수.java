public class Solution {

    boolean solution(String s) {
        boolean answer = true;

        s = s.replace("P","p");
        s = s.replace("Y","y");
        System.out.println(s);

        int a = s.length();
        int b = s.replace("p", "").length();
        int c = s.replace("y", "").length();

        if(b == c){
            answer = true;
        }else {
            answer = false;
        }
        System.out.println("Hello Java");

        return answer;
    }
}
