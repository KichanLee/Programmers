import java.util.*;

class Solution {
    public String solution(String phone_number) {
        
        // java에서 String은 c언어의 char *와 같이 수정이 불가하여, 
        // char * -> char [] 와 같이 수정이 가능한 String -> StringBuilder로 변경
        StringBuilder sb = new StringBuilder(phone_number);
        
        // setCharAt(문자열의 인덱스 값, 대체할 문자) 
        for(int i = 0; i < sb.length() - 4; ++i)
            sb.setCharAt(i, '*');
        
        // 문제에서 요구하는 반환형인 string으로 변경 , toString()함수 사용
        String answer = sb.toString();
        return answer;
    }
}
