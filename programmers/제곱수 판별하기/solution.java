// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120909

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);
       if(sqrt*sqrt==n) {
           answer = 1;
       }  else {
           answer = 2;
       }
        
        return answer;
    }
}