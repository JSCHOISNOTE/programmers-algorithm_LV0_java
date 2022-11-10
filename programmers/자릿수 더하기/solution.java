// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120906

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n !=0 ) {
            if(n >=10) {
                answer += n%10;
                n = n/10;
            } else {
                answer += n;
                break;
            }
        }
        
        return answer;
    }
}