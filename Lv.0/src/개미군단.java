class Solution {
    public int solution(int hp) {
        int answer = 0;
        int generalSp = 5;
        int soldierSp = 3;
        int workerSp = 1;

        int divide = 0;
        if (hp >= generalSp) {
            divide = hp / generalSp;
            hp -= divide * generalSp;
            answer += divide;
        }
        if (hp >= soldierSp || hp < generalSp) {
            divide = hp / soldierSp;
            hp -= divide * soldierSp;
            answer += divide;
        }
        if (hp < soldierSp) {
            answer += hp;
        }

        return answer;
    }
}