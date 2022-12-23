import java.util.*;

class Solution {
    
    public boolean test(String s)
    {
        if (s.length() % 2 == 1) return false;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); ++i)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push((int)s.charAt(i));
          
            // peek 함수는 스택에 가장 끝에 있는 것을 보여주는 함수 
            else if(!stack.empty())
            {    
                if(s.charAt(i) == ')' && stack.peek() != '(')
                    return false;
                else if(s.charAt(i) == ']' && stack.peek() != '[')
                    return false;
                else if(s.charAt(i) == '}' && stack.peek() != '{')
                    return false;
                stack.pop();
            }
        }
        if(stack.empty())
                return true;
        
        return false;
    }
    
    
    
    public int solution(String s) 
    {
        String s2 = new String();
        s2 = s + s;
        int count = 0;
         
        for(int i = 0; i < s.length(); ++i)
        {
            if(test(s2.substring(i, i + s.length())))
               count++;
        }
    
        return count;
    }
    
}
