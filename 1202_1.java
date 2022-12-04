import java.util.*;

class Solution {
    public int solution(int left, int right) {
        
        int answer = 0;
        
        int tmp = left;
        
        int arr[] = new int[right - left + 1];
        
        int i = 0;
        
        while (left <= right)
        {
            int j = 1;
            while (j <= left)
            {
                if (left % j == 0)
                    arr[i]++;
                j++;
            }
            ++left;
            ++i;
        }
        
        for(int k = 0 ; k < arr.length; ++k)
        {
            if(arr[k] % 2 == 0)
                answer += tmp;        
            else
                answer -= tmp;
            tmp++;
        }
        return answer;
    }
}
