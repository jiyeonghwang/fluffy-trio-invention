import java.util.List;

public class Solution02MockTestDH {
    class Result {
        /*
         * Complete the 'flippingMatrix' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
         */
        public static int flippingMatrix(List<List<Integer>> matrix) {
            int answer = 0;
            int n = matrix.size();
            for (int i=0;i<n/2;i++) {
                for (int j=0;j<n/2;j++) {
                    answer += Math.max(matrix.get(i).get(j),
                                Math.max(matrix.get(i).get(n-1-j),
                                    Math.max(matrix.get(n-1-i).get(j), matrix.get(n-1-i).get(n-1-j))));
                }
            }

            return answer;
        }
    }

}
