import java.util.*;

class Solution {
    class Term {
        String kind;
        int period;

        public Term(String kind, int period) {
            this.kind = kind;
            this.period = period;
        }
    }

    class Privacy {
        int year, month, day, idx;
        Term term;

        public Privacy(int year, int month, int day, Term term, int idx) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.term = term;
            this.idx = idx;
        }

        public boolean isExpired(String today) {
            int[] todays = Arrays.stream(today.split("\\."))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int year = this.year;
            int month = this.month;
            int day = this.day - 1;

            if (day == 0) {
                day = 28;
                month--;
            }

            month += this.term.period;
            while (month > 12) {
                year++;
                month -= 12;
            }

            if (todays[0] > year) {
                return true;
            }

            if (todays[0] == year && todays[1] > month) {
                return true;
            }

            if (todays[0] == year && todays[1] == month && todays[2] > day) {
                return true;
            }

            return false;
        }
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        int n = privacies.length;
        int t = terms.length;
        Privacy[] privacyArr = new Privacy[n];
        Term[] termArr = new Term[t];

        for (int i = 0; i < t; i++) {
            String[] strArr = terms[i].split(" ");

            String kind = strArr[0];
            int period = Integer.parseInt(strArr[1]);

            Term term = new Term(kind, period);
            termArr[i] = term;
        }

        for (int i = 0; i < n; i++) {
            String[] strArr = privacies[i].split(" ");

            String dateStr = strArr[0];
            String kind = strArr[1];

            String[] dateArr = dateStr.split("\\.");
            int year = Integer.parseInt(dateArr[0]);
            int month = Integer.parseInt(dateArr[1]);
            int day = Integer.parseInt(dateArr[2]);

            Term term = null;
            for (Term tr : termArr) {
                if (tr.kind.equals(kind)) {
                    term = tr;
                    break;
                }
            }

            Privacy privacy = new Privacy(year, month, day, term, i + 1);
            privacyArr[i] = privacy;
        }

        List<Integer> expiredIdxList = new ArrayList<>();

        for (Privacy privacy : privacyArr) {
            if (privacy.isExpired(today)) {
                expiredIdxList.add(privacy.idx);
            }
        }

        int[] answer = new int[expiredIdxList.size()];
        for (int i = 0; i < expiredIdxList.size(); i++) {
            answer[i] = expiredIdxList.get(i);
        }

        return answer;
    }
}