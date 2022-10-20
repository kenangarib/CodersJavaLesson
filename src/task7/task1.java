package task7;

public class task1 {
    public static void main(String[] args) {



        int[][] array = new int[][]{{5, 10, 15},      // 00,01,02
                                   {20, 25, 30},      // 10,11,12
                                   {35, 40, 45}};     // 20,21,22

        int rightSide = 0;
        int leftSide = 0;
        int down = 0;
        int leftToRight = 0;
        int n = array.length;

        for (int i = 0, j = 1; i < n; i++, j++) {

            rightSide = array[i][n - i - 1];    //[0][3-0-1],    [1][3-1-1],   [2][3-2-1]
            int rightSide2 = array[i][(n-1) - i - 1];
//            down = array[i][0];                            //[i][i/0]
//            leftToRight = array[0][i];
//            System.out.println(down / down + " " + leftToRight / leftToRight + " " + rightSide / rightSide);
            System.out.println(rightSide + " " + rightSide2);

        }
        //System.out.println(leftToRight);
    }
}
