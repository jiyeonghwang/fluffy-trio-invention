import java.util.Collections;
import java.util.List;

class Solution03MockTestDH {
    /*
    * Complete the 'getTotalX' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    * 1. INTEGER_ARRAY a
    * 2. INTEGER_ARRAY b
    */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int answer = 0;

        Collections.sort(a);
        Collections.sort(b);

        for (int i=a.get(a.size()-1);i<=b.get(0);i++) {
            boolean checkA = true;
            boolean checkB = true;

            for (int j=0;j<a.size();j++) {
                if (i%a.get(j) != 0) {
                    checkA = false;
                    break;
                }
            }

            for (int j=0;j<b.size();j++) {
                if (b.get(j)%i != 0) {
                    checkB = false;
                    break;
                }
            }

            if (checkA && checkB) {
                answer++;
            }
        }

        return answer;
    }
}
