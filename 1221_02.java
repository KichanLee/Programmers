import java.util.*;
class Solution {
    public int solution(int[] arr)
    {
        
        int answer = 0;
        // arr 정렬해주기
        Arrays.sort(arr);
        
        int count = 0;
        int i = 2;
        // arr 가장 뒤에 있는 값 max로 설정
        int max = arr[arr.length -1];
        
        int gcd = 1;
        while (i <= max)
        {   
            count = 0;
            
            for(int j = 0; j < arr.length; ++j)
                if(arr[j] % i == 0)
                    ++count;
            
            // 나누어진 갯수가 2개 이상이라면 공통된 약수가 있다는 뜻
            if(count > 1)
            {
                gcd = gcd * i;
                
                for(int k = 0; k < arr.length; ++k)
                {
                    if(arr[k] % i == 0)
                        arr[k] = arr[k] / i;
                }
                i = 2;
                // 어떤 수로 나누어지면 최솟값인 2부터 시작해주기
                continue;
            }
            ++i;
        }
                
        int sum = 1;
                
        for(int k = 0 ; k < arr.length ; ++k)
            sum =  sum * arr[k];
        sum *= gcd;
        
        return sum;
    }

}
