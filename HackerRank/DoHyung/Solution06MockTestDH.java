class Solution06MockTestDH {
    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int palindromeIndex(String s) {
        if (isPalindrome(s)) {
            return -1;
        }

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                if (isPalindrome(s.substring(0,i)+s.substring(i+1))) {
                    return i;
                }

                if (isPalindrome(s.substring(0,s.length()-1-i)+s.substring(s.length()-i))) {
                    return s.length()-1-i;
                }
            }
        }

        return -1;
    }

    public static boolean isPalindrome(String s) {
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }

        return true;
    }
}
