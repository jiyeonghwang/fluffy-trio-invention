class Result {
    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
1
        2
        3
        4
        5
        6
        7
        8
        9
        3/3
    public static int anagram(String s) {
        // Write your code here
        if (s.length()%2 != 0) return -1;
        char[] arr = s.substring(0, s.length()/2).toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        }
        arr = s.substring(s.length()/2, s.length()).toCharArray();
        for (char c : arr) {
            if (map.containsKey(c)) map.put(c, map.get(c)-1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        int result = 0;
        for (int i : list) {
            if (i>0) result += i;
        }

        return result;
    }
}