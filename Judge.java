public class Judge {

    public int findJudge(int N, int[][] trust) {

        int[] matrix = new int[N + 1];

        for (int i = 0; i < trust.length; i++) {
            int[] sum = trust[i];

            //decrease index
            matrix[sum[0]]--;

            //increase index
            matrix[sum[1]]++;
        }

        //return index with N-1
        for (int i = 1; i <= N; i++) {
            if (matrix[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
