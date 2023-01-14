import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        String as = "";
        int len= numbers.length;
        int cnt = 0;
        
        String[] answer = new String[len];
        
        for(int i = 0; i < len ; ++i)
            answer[i] = Integer.toString(numbers[i]); 
            
        // compare 함수 재정의 
        Arrays.sort(answer, new Comparator<String>(){
            
            public int compare(String num1 , String num2){
                return (num2 + num1).compareTo(num1 + num2);
            }
        });
        // answer에 0만 있는 경우 확인
        for(int k = 0; k < len ; ++k)
        {    
            if(answer[k].equals("0"))
                ++cnt;
        }
        if(cnt == len)
            return ("0");
        for(int j = 0; j < len ; ++j)
           as = as + answer[j];
        return as;
    }
}
