public class Driver {

    public static void main(String[] args) {
        Judge j = new Judge();
        int N;
        int output;

        int[][] test_01 = { {1, 2} };
        N = 2;
        output = j.findJudge(N, test_01);
        if (output == -1){
            System.out.println("Town judge does not exist.");
        } else {
            System.out.println("ID of judge: " + output);
        }

        int[][] test_02 = { {1, 3}, {2, 3} };
        N = 3;
        output = j.findJudge(N, test_02);
        if (output == -1){
            System.out.println("Town judge does not exist.");
        } else {
            System.out.println("ID of judge: " + output);
        }

        int[][] test_03 = { {1, 3}, {2, 3}, {3, 1} };
        N = 3;
        output = j.findJudge(N, test_03);
        if (output == -1){
            System.out.println("Town judge does not exist.");
        } else {
            System.out.println("ID of judge: " + output);
        }

        int[][] test_04 = { {1, 2}, {2, 3} };
        N = 3;
        output = j.findJudge(N, test_04);
        if (output == -1){
            System.out.println("Town judge does not exist.");
        } else {
            System.out.println("ID of judge: " + output);
        }

        int[][] test_05 = { {1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3} };
        N = 4;
        output = j.findJudge(N, test_05);
        if (output == -1){
            System.out.println("Town judge does not exist.");
        } else {
            System.out.println("ID of judge: " + output);
        }
    }
}
