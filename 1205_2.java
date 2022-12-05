import java.util.*;

class Solution {
    public int solution(int n) {
    
        int answer = 0;
        String three = "";
        
        while (n != 0)
        {
            three = (n % 3) + three;
            n = n / 3;
        }
        // 나머지 값을 문자열에 담아주는 
        // three = 1200 출력

        // java 의 math.pow는 거듭제곱을 계산해주는 내장함수입니다.
        // Math.pow(2, 4) 2의 4거듭제곱으로 16 출력
        // three.charAt(i)는 문자열 인덱스에 접근하는 함수로 []와 같은 역할입니다.
        // 1 * (Math.pow(3, 0) + 2 * 1 * (Math.pow(3, 1) 
      
        for(int i=0; i<three.length(); i++)
            answer = answer + (int)(Math.pow(3, i) * (three.charAt(i) - '0'));
                                                   
        return answer;
    }
}
