class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int min_count = 0;
        int zero_count = 0;
        int tmp = 0;
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < lottos.length; ++i)
        {
             for(int j = 0; j < lottos.length; ++j)
             {
                    if(lottos[i] == win_nums[j])
                        ++tmp;
             }
              if (lottos[i] == 0)
                        ++zero_count;
        }
    

        switch (zero_count + tmp){
            
            case 6:
                    max = 1;
                    break;
            case 5:
                    max = 2;
                    break;
            case 4:
                    max = 3;
                    break;
            case 3:
                    max = 4;
                    break;
            case 2:
                    max = 5;
                    break;
            default:
                    max = 6;
                    break;
        }
    
        switch (tmp)
        {
            case 6:
                    min = 1;
                    break;
            case 5:
                    min = 2;
                    break;
            case 4:
                    min = 3;
                    break;
            case 3:
                    min = 4;
                    break;
            case 2:
                    min = 5;
                    break;
            default:
                    min = 6;
                     break;
        }
        
        int[] answer = {max, min};
        
        return answer;
    }
}
