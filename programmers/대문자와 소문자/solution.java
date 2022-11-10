// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120893

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arry = my_string.toCharArray();
		
		// a ~ z 97 ~122
		// A ~ Z 65~90
		
		String temp ="";

		for(int i = 0; i<arry.length; i++) {
			if( arry[i] >= 97 && arry[i] <= 122 ) {
				temp = arry[i] + "";
				answer += temp.toUpperCase();
			} else if( arry[i] >=65 && arry[i] <= 90){
				temp = arry[i] + "";
				answer += temp.toLowerCase();
			}
		}
        return answer;
    }
}