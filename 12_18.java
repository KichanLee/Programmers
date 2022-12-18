import java.util.*;

class Solution {
    boolean solution(String s) {
        int first = 0;
        int second = 0;
        
        for(int i = 0 ; i < s.length(); ++i)
        {
            if (s.charAt(i) == '(')
                ++first;
            else
                ++second;
            if(first < second)
                return false;
        }
        if(first != second)
                return false;
        return true;
    }
}
