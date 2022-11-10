// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120847

import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int max = numbers.length;
        answer = numbers[max-1] * numbers[max-2];
        
        return answer;
    }
}