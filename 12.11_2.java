import java.util.*;

class Solution {
    public String solution(String s) {
           
        // char * -> char []로 변환
        char [] answer = s.toCharArray();

        int j = 0;
        for(int i = 0; i < answer.length; ++i)
        {
            if (answer[i] == ' ')
                j = -1;
            if ((j % 2 == 0) && (answer[i] >= 'a' && answer[i] <= 'z'))
                answer[i] -= 32;
            else if ((j % 2 == 1) && (answer[i] >= 'A' && answer[i] <= 'Z'))
                answer[i] += 32;
            ++j;
        }
        // char [] - > char *로 변환
        String an = new String(answer);
        System.out.println(an);
        return  an;
    }
}
