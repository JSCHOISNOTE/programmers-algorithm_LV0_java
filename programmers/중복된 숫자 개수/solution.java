// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120583

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int index = 0;
        for(int i = 0; i<array.length; i++) {
            if(array[i] == n) {
                index ++;
            }
        }
        answer = index;
        
        return answer;
    }
}