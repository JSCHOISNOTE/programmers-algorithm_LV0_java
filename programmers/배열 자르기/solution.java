// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120833

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = new int [num2-num1+1];
		
		int index = 0;
		for(int i = num1; i<=num2; i++) {
			answer[index] = numbers[i];
			index++;
		}
		
        
        return answer;
    }
}