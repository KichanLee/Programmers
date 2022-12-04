import java.util.*;

class Solution {
    public int solution(int[] a, int[] b) {
     
        for(int i = 0; i < a.length; ++i)
            a[i] *= b[i];
      
        return Arrays.stream(a).sum();
    }
}
