import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
      // 배열 정렬
        Arrays.sort(A);
        Arrays.sort(B);
    // 0, 1, 2, 3    -- 4, 5, 6, 7
    // (0 * 7) + (1 * 6) + (2 * 5) ...
        for(int i = 0; i <= A.length - 1; ++i)
            answer += A[i] * B[A.length - 1 - i];
        
        return answer;
    }
}
