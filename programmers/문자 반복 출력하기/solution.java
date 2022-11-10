// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120825

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] arry = my_string.split("");
     
        int num = arry.length;
		
		int index = 0;
		while(index < num ) {
			for(int i = 0; i< n; i++) {
				answer += arry[index]; 
			}
			
			index ++;
		}
        return answer;
    }
}