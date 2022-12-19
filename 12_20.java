import java.util.*;
class Solution {
    
  // 문자열에서 0갯수 반환해주는 함수
    public int countZero(String str)
    {
        int one_count = 0;

        for(int i = 0; i < str.length(); ++i)
        {
            if(str.charAt(i) == '1')
                ++one_count;
        }

        return str.length() - one_count;
    }
    
    // 1의 갯수 받아서 2진법 만들어 주는 함수
    // n으로 4 들어오면 "1111" 반환
    public String makeOne(int n)
    {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n ; ++i)
            ans.append("1");

        String ss = new String(ans);

        return ss;
    }
   
    public int[] solution(String s) {
        
        int ZeroSum = 0;
        int OneCount = 0;
        int count = 0;
      
        while (s.length() != 1) 
        {
            ZeroSum += countZero(s);
            OneCount = s.length() - countZero(s);

            s = makeOne(OneCount);
            // toBinaryString 함수 10진수 -> 2진수
            s = Integer.toBinaryString(s.length());
            ++count;
        }

        int arr[] = {count , ZeroSum};
        
        return arr;
    }
}
