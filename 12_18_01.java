import java.util.*;

class Solution {
    public String solution(String s) {
        // char * -> char [] 로 문자를 수정할 수 있도록 변경
        char ch[] = s.toCharArray();
        // 주어진 문자열을 ascii 오름차순으로 변경
        Arrays.sort(ch);
        // 답을 담아줄 문자열 배열 생성
        char ch2[] = new char[s.length()];
        // 정렬을 완료했으니, 새로운 배열에 뒤에서 부터 담아주기
        for(int i = s.length() -1 ; i > -1 ; --i)
            ch2[(s.length() - 1) - i] = ch[i];
        // 반환형을 char [] -> char * 로 다시 변경해주기
        String answer = new String(ch2);
        
        return answer;
    }
    
}
