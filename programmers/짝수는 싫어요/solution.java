// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120813

class Solution {
    public int[] solution(int n) {
        int[] arr = new int[100];
        
        int index = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                arr[index] = i;
                index++;
            }
        }
        int[] answer = new int[index];
        for(int i = 0; i<index; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}