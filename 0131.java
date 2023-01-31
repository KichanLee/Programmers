import java.util.*;
import java.util.Stack;

class Solution 
{
    static int idx = 0;
    
    public String solution(String number, int k) {

        String answer = "";
        
        Stack<Character> stack = new Stack<Character>();
        
        int depth = 0;
        int len = number.length() - 1;
        int fin = len - k + 1;
        int i = 0;
        int idx = 0;
        
        while(stack.size() != fin)
        {
            i = idx;
            char first = number.charAt(i);
            stack.push(first);
            
            for(int j = i + 1; j <= len - k + depth; ++j)
            {
                if(stack.peek() < number.charAt(j))
                {
                    stack.pop();
                    char ch = number.charAt(j);
                    stack.push(ch);
                    idx = j;
                }
                else
                    ++idx;
            }
            ++depth;
            if(depth > k)
                break;
            ++idx;
        }
        for(int q = 0; q < stack.size(); q++)
            System.out.print(stack.get(q) + " ");
        return answer;
    }
}
