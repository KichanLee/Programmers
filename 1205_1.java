import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
     
        // 각 원소의 합을 담아줄 list생성
        // List 사용이유 : 갯수가 몇개 필요한지 모르니 동적으로 추가 해줄수 있기 때문.
        ArrayList<Integer>answer = new ArrayList<Integer>();
   
        // 배열의 모든 합 담아주기
        for(int i = 0; i < numbers.length - 1; ++i)
            for(int j = i + 1; j < numbers.length; ++j)
                 answer.add(numbers[i] + numbers[j]);
        
        // 모든 합을 오름차순으로 정렬 
        //  3, 5, 6, 2, 2, 7, 7 -> 2, 2, 3, 5, 6, 7, 7
        Collections.sort(answer);
        
        // 중복을 제거해줄 새로운 list 생성.
        ArrayList<Integer>ra = new ArrayList<Integer>();
        
        // 중복 제거해서 기존 answer list -> ra list에 담아주기
        for(Integer k : answer)
            if(!ra.contains(k))
                    ra.add(k);
        
        // list의 크기를 구한 후 배열로 선언 
        int arrSize = ra.size();
        
        int[] arr= new int[arrSize];
        
        // list -> array로 변환해주는 과정
        for(int i = 0; i < arrSize ; ++i)
            arr[i] = ra.get(i);
        return arr;
    }
}
