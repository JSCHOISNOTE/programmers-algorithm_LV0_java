// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120854

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int length = strlist.length;
        for(int i = 0; i<length; i++){
            answer[i] = strlist[i].length();
        }
        
        //map 활용 가능하다.
        return answer;
    }
}