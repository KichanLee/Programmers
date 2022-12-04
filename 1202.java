import java.util.*;

class Solution {
    public int solution(String s) {
        
        HashMap<String, Integer> map= new HashMap<String, Integer>();
        
        // one , 1  / string, integer 형식으로 key, value담아주기
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        // keyset만 Set에 담아주기
		Set<String> key = map.keySet();

      // 
		for (String s1 : key)
			s = s.replace(s1, map.get(s1).toString());
      
        int anwer = Integer.parseInt(s);
        
		return anwer;
    
    }
}
