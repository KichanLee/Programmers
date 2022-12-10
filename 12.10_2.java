class Solution {
    public int[] solution(long n) {
        int i = 0;
        int j = 0;
        long tmp = n;
        
        while (tmp!= 0)
        {
            tmp /= 10;
            i++;
        }
        int[] answer = new int[i];
        while (n != 0)
        {
            answer[j] = (int) (n % 10);
            n /= 10;
            ++j;
        }
        
        return answer;
    }
}
