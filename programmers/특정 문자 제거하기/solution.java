// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120826

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
		if(my_string.contains(letter)) {
			answer = my_string.replaceAll(letter, "");
		}
        return answer;
    }
}