class Solution {
    public long solution(long n) {
      
        for(long i = 1; i <= Math.sqrt(n); ++i)
            if (i * i == n)
                return ((long)Math.pow(i + 1, 2));
        
      return -1;
    }
}
