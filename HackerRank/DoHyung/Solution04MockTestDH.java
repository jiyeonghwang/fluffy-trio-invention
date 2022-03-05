class Solution04MockTestDH {
    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int anagram(String s) {
        if (s.length()%2 == 1) {
            return -1;
        }

        int[] alphabets = new int[26];

        for (int i=0;i<s.length()/2;i++) {
            alphabets[s.charAt(i)-'a']++;
        }

        for (int i=s.length()/2;i<s.length();i++) {
            alphabets[s.charAt(i)-'a']--;
        }
        int answer = 0;
        for (int i=0;i<alphabets.length;i++) {
            if (alphabets[i] != 0) {
                answer += Math.abs(alphabets[i]);
            }
        }

        return answer/2;
    }
}
