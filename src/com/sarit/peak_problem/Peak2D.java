package com.sarit.peak_problem;

public class Peak2D {

    public static Point2D naive2DPeak(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i - 1 >= 0 && matrix[i - 1][j] > matrix[i][j])
                    continue;
                if (i + 1 < matrix.length && matrix[i + 1][j] > matrix[i][j])
                    continue;
                if (j - 1 >= 0 && matrix[i][j - 1] > matrix[i][j])
                    continue;
                if (j + 1 < matrix[i].length && matrix[i][j + 1] > matrix[i][j])
                    continue;

                return new Point2D(i, j);
            }
        }

        return null;
    }
}
