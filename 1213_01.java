import java.util.*;

class Solution {
    public String solution(int n) {
    
        StringBuilder sb = new StringBuilder();
        
        char a = '수';
        char b = '박';
        
        for(int i = 0; i < n; ++i)
        {
            if(i % 2 == 0)
                sb.append(a);
            else
                sb.append(b);
        }
        return sb.toString();
    }
}
