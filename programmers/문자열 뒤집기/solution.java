// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120822

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] string = my_string.split("");
        for(int i = string.length-1; i>=0; i--) {
            answer += string[i];
        }
       
        return answer;
    }
}