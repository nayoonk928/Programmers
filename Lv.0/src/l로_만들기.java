class Solution {
    public String solution(String myString) {
        char[] ch = myString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < 'l') {
                sb.append('l');
            } else {
                sb.append(ch[i]);
            }
        }

        return sb.toString();
    }
}