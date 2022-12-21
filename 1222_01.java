class Solution {
    public long solution(int n) {
        
        long answer = 0;
        long first = 1;
        long second = 2;
       
        if(n == 1)
            return 1;
        
        if( n == 2)
            return 2;
        
        for(int i=3; i <= n; i++) 
        {
            answer = (first + second) % 1234567;
            first = second;
            second = answer;
        }
        return answer;
    }
}
