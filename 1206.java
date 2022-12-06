import java.util.*;

class Solution {
  
    // 소수판별함수  
    int prime(int sum)
    {
        int count = 0;
        
        for(int i = 1; i <= (int)Math.sqrt(sum); ++i)
            if (sum % i == 0)
                count++;    
        if (count == 1)
            return (1);
    
        return(0);
    }
    
    public int solution(int[] nums) {

      int sum = 0;
      int answer = 0;
        for(int i = 0 ; i < nums.length -2; ++i)
            for(int j = i + 1 ; j< nums.length -1; ++j)
                for(int k = j + 1; k < nums.length ; ++k)    
                {
                    sum = nums[i] + nums[j] + nums[k];
                    if (prime(sum) == 1)
                        answer++;
                }

        return answer;
    }
}
