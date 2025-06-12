public class MatrixPractice {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1,2}, {2,1}};
        int[][] secondMatrix = {{0,3}, {9,1}};

        int[][] sumMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            sumMatrix[0][i] = firstMatrix[0][i] + secondMatrix[0][i];
            sumMatrix[1][i] = firstMatrix[1][i] + secondMatrix[1][i];
        }

        for (int i = 0; i < 2; i++) { System.out.print(sumMatrix[0][i] + " ");}
        System.out.println();
        for (int i = 0; i < 2; i++) { System.out.print(sumMatrix[1][i] + " ");}

//        System.out.println(firstMatrix[0][0] + secondMatrix[0][0]);
//        System.out.println(firstMatrix[0][1] + secondMatrix[0][1]);
//
//        System.out.println(firstMatrix[1][0] + secondMatrix[1][0]);
//        System.out.println(firstMatrix[1][1] + secondMatrix[1][1]);
    }
}
