//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//        제한사항
//arr은 자연수를 담은 배열입니다.
//        정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // divisor로 나누어지는 배열 ArrayList에 저장
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>0 && arr.length>=1 && divisor>0) {
                if (arr[i] % divisor == 0) {
                    arrayList.add(arr[i]);
                }
            }
        }
        // ArrayList 오름차순 정리
        arrayList.sort(Comparator.naturalOrder());
        
        // ArrayList의 값을 다시 배열로 저장 / 하나도 없다면 배열에 -1
        if (arrayList.size()>0) {
            answer = new int [arrayList.size()];
            for (int i=0; i<arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}

//public static void main(String[] args) {
//    int[] arr1 = {3,2,6};
//    int divisor1 = 10;
//    Solution18 s = new Solution18();
//
//    for (int i=0; i<s.solution(arr1, divisor1).length; i++) {
//        System.out.println(s.solution(arr1, divisor1)[i]);
//    }
//}
