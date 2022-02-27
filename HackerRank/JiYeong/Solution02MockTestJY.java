class Result {
    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int result = 0;
        int n = matrix.size();

        for (int i=0; i<n/2; i++) {
            for (int j=0; j<n/2; j++) {
                int num1 = matrix.get(i).get(j);
                int num2 = matrix.get(i).get(matrix.size()-j-1);
                int num3 = matrix.get(matrix.size()-i-1).get(j);
                int num4 = matrix.get(matrix.size()-i-1).get(matrix.size()-j1);
                result += Math.max(num1, Math.max(num2, Math.max(num3,
                        num4)));
            }
        }

        return result;
    }
}