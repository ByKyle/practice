package cn.yk.practice.leetcode;

/**
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Follow up:
 * Could you do this in-place?
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        if (n == 1 | n == 0) {
            return;
        }
        int layers = n / 2;
        for (int i = 0; i < layers; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                matrix[i][j] = matrix[i][j] ^ matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j] ^ matrix[j][n - 1 - i];
                matrix[i][j] = matrix[i][j] ^ matrix[j][n - 1 - i];

                matrix[i][j] = matrix[i][j] ^ matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[i][j] ^ matrix[n - 1 - i][n - 1 - j];
                matrix[i][j] = matrix[i][j] ^ matrix[n - 1 - i][n - 1 - j];

                matrix[i][j] = matrix[i][j] ^ matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[i][j] ^ matrix[n - 1 - j][i];
                matrix[i][j] = matrix[i][j] ^ matrix[n - 1 - j][i];
            }
        }
        display2DMatrix(matrix);
    }

    private void display2DMatrix(int[][] matrix) {
        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
                if (j == n - 1)
                    System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        RotateImage r = new RotateImage();
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] b = {
                {1,2},
                {3,4}
        };
        r.display2DMatrix(a);
        System.out.println("");
        r.rotate(a);
    }
}
