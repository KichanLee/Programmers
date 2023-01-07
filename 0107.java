import java.util.*;

class Solution {
    public int solution(String word) {

        List<String> lkc = new ArrayList<>();
        List<String> dic = List.of("A", "E", "I", "O", "U");
        
        for (int a = 0 ; a < 5; a ++) {
            lkc.add(dic.get(a));
            for (int b = 0; b < 5; b ++) {
                lkc.add(dic.get(a)+dic.get(b));
                for (int c = 0; c < 5; c ++) {
                    lkc.add(dic.get(a)+dic.get(b)+dic.get(c));
                    for (int d = 0; d < 5; d ++) {
                        lkc.add(dic.get(a)+dic.get(b)+dic.get(c)+dic.get(d));
                        for (int e = 0; e < 5; e ++) {
                            lkc.add(dic.get(a)+dic.get(b)+dic.get(c)+dic.get(d)+dic.get(e));
                        }
                    }
                }
            }
        }
        int idx = 1;
        for (String s: lkc) {
            if (s.equals(word)) 
                return (idx);
            idx++;
        }
        return idx;
    }
}
