class Solution02 {
    public int solution(String s) {
        int answer = 0;
        
        try {
            answer = Integer.parseInt(s); // 문자를 숫자로 형변환 하는 함수
            // Integer.parseInt()를 사용할 경우 try~ catch로 감싸주기 에러나는걸 방지
            // 하기 위해
        }
        catch (NumberFormatException ex) { // 숫자 형식의 오류가 나는걸 막기위해
                                        // NumberFormatException(예외처리를 함)
            ex.getStackTrace(); // ex.printStackTrace(); 지향
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution02 sol = new Solution02(); // new 생성자를 만들어 테스트 출력만들기
        // 테스트 출력
        System.out.println(sol.solution("1234")); // 1234 출력

    }
}

// 문제 설명
// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

/*
  ex.printStackTrace(); 지향해야 하는 이유
    
1. System.err 로 쓰여지게 되면서 제어하기 힘들다.
2. System.err 로 쓰여지게 되면서 리소스 비용이 비싼편이다.
3. Java의 Reflection(리플렉션)을 사용하여 예외를 추적하는 것이라 많은 오버헤드가 발생한다.
4. 서버에서 메소드(Method) 스택정보를 취합하기 때문에 서버에 부하의 원인이 된다.
5. 출력이 어디로 향하는지 파악하기 어렵다.(톰캣의 경우 catalina.out 에 남을 수도 있다)
6. 관리가 어렵다.(보통 log4j, logback 으로 로그 패턴 및 로그 메세지를 지정하여 사용한다.)
*/

// 나중에 에러가 생겼을 때 controller 와 service에서 수많은 에러 들이 나와서 디버깅 하기
// 힘들기 때문에 getStackTrace(); 함수를 쓰면 디버깅 에러를 쉽게 확인 할수 있다.
