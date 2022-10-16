package task6;

public class task2 {
    private static void findDiagonal(int arr[][], int n){

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++){
            leftSum += arr[i][i];
            rightSum += arr[i][n-i-1];
        }
        System.out.println("Solun toplami: " + leftSum + " " + "Sagin toplami: " + rightSum);

    }

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3},
                                  {4,5,6},
                                  {7,8,9}};
        findDiagonal(arr,arr.length);
    }
}