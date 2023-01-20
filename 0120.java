class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        int idx = 0;
        for(long l: numbers) {
            StringBuilder sb = 
            new StringBuilder(Long.toBinaryString(l));

            int lastZeroBit = sb.lastIndexOf("0");
            int lastOneBit = sb.lastIndexOf("1");

            if(lastZeroBit == -1) { // 전부 1일 때
                sb.setCharAt(0, '0'); // 제일 뒤 비트 0
                sb.insert(0, "1");
            }else if(lastOneBit == -1) { // 전부 0일 때
                sb.setCharAt(lastZeroBit, '1');
            }else { // 10111
                if(lastZeroBit == sb.length()-1) {
                    sb.setCharAt(lastZeroBit, '1');
                }else {
                    int oneBit = sb.indexOf("1", lastZeroBit);

                    if(oneBit == -1) oneBit = sb.length()-1;
                    sb.setCharAt(lastZeroBit, '1');
                    sb.setCharAt(oneBit, '0');
                }

            }
            answer[idx++] = Long.parseLong(sb.toString(), 2);
        }

        return answer;
    }
}
