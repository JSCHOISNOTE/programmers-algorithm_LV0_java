// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120851

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String replace = "";
		replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] arry = replace.split("");

            for(int i = 0; i< arry.length; i++) {
                answer += Integer.parseInt(arry[i]);
            }

        
        return answer;
    }
}