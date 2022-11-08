// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120806

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        //타입변환 주의
        //들어오는 변수 num1, 2 가 int type
        //나머지 계산시 double 타입 변환 
        double x = (double) num1 / num2;
        answer = (int) (x *1000);
        
        return answer;
    }
}