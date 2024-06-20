class Solution {
    boolean solution(String s) {
        boolean answer = true; // boolean : true, false answer 변수 를 true로 초기화
        int p = 0; // 변수 초기화
        int y = 0; // 변수 초기화
        s = s.toLowerCase(); // s. 란 변수에 toLowerCase()함수(모든 문자를 소문자로변환) 사용
        for (int i = 0; i < s.length(); i++) { // for문 을 이용해서 s.값에 있는 소문자 변환된 값들 길이 와 증가
            if (s.charAt(i) == 'p') { // s.란 변수에 charAt(문자열 변환)함수를 사용해 i값을 저장? 'p'값의 길이 구하기
                p++; // 만약 'p' 값이란(문자열의)길이를 다구했으면 증가하여 한번더
            } else if (s.charAt(i) == 'y') { // 한번더 조건을 추가하여 'y'값의 길이 구하기
                y++;// 위쪽과 동일
            }
        } if (p != y) {
            answer = false; //만약 'p'값과 'y'값이 다르면 false
        }

        return answer; // boolean에 'p'값과 'y'값을 비교했을때 같으면 True, 다르면 False를 return
    }
}


// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를
// 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y'
// 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는
// 구별하지 않습니다.
//
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
