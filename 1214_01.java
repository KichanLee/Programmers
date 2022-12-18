import java.util.*;

class Solution {
    public String solution(String s) {
        
        // char * -> char []로 변경하기 위한 StringBuilder Class 생성
        StringBuilder sb = new StringBuilder();
        
        // 짝수인지 홀수인지 확인하는 index
        int i = s.length() / 2;
        
        // 홀수 이면 가운데 글자 반환
        if(s.length() % 2 == 1)
            sb.append(s.charAt(i));
        // 짝수이면 -1 , i 반환 
        else
        {
            sb.append(s.charAt(i - 1));
            sb.append(s.charAt(i));
        }
            // char [] -> char *로 반환
        return sb.toString();
    }
}
