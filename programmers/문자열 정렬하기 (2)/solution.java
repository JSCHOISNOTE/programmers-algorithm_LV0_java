// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120911

import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arry = my_string.toLowerCase().split("");
        
        Arrays.sort(arry);
        
        for(int i = 0; i<arry.length; i++){
            answer += arry[i];   
        }        
        return answer;
    }
}