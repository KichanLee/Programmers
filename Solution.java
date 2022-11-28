class Solution {
    private static final String[] INDICATORS = {"RT", "CF", "JM", "AN"};

    public String solution(String[] survey, int[] choices) {
        int[] cnt = new int['Z'-'A'+1];

        for (int i = 0; i < survey.length; i++) {

            char a = survey[i].charAt(0);
            // survey[i] 좌측문자 RT 인 경우 R
            // charAt(i) 로 문자열 인덱스 접근
            char b = survey[i].charAt(1);
            // survey[i] 우측문자 T
            int score = choices[i]-4;

            if (score == 0)
                continue;

            if (score < 0)
                cnt[a-'A']-=score;
            // 음수면 좌측문자에 영향
            else
                cnt[b-'A']+=score;
            // 양수면 우측문자에 영향
        }

        StringBuilder sb = new StringBuilder();
        // 문자열 담아주는 함수
        for (int i = 0; i < INDICATORS.length; i++) {

            char a = INDICATORS[i].charAt(0);
            char b = INDICATORS[i].charAt(1);

            int cntA = cnt[a-'A'];
            int cntB = cnt[b-'A'];

            if (cntA == cntB)
                sb.append(a);
            else
                sb.append(cntA > cntB ? a:b);
        }
        return sb.toString();
    }
}오