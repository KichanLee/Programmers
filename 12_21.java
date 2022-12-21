class Solution {
     public int solution(int n) {
        int answer = 0;
        int first = 1;
        int second = 1;
        
        if( n == 2)
            return 1;
        for(int i=3; i<=n; i++) 
        {
            answer = (first + second) %1234567;
            first = second;
            second = answer;
        }
            return answer;
        }
    }
