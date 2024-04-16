package com.coding.Graph;

public class BinaryMatrixPerimeter {
    public int perimeterOfShapes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int perimeter = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    perimeter += dfs(matrix, visited, i, j);
                }
            }
        }

        return perimeter;
    }

    private int dfs(int[][] matrix, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] == 0)
            return 1;

        if (visited[row][col])
            return 0;

        visited[row][col] = true;

        int perimeter = 0;

        perimeter += dfs(matrix, visited, row - 1, col); // Up
        perimeter += dfs(matrix, visited, row + 1, col); // Down
        perimeter += dfs(matrix, visited, row, col - 1); // Left
        perimeter += dfs(matrix, visited, row, col + 1); // Right

        return perimeter;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 1},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 1}
        };

        BinaryMatrixPerimeter bmp = new BinaryMatrixPerimeter();
        int perimeter = bmp.perimeterOfShapes(matrix);
        System.out.println("Perimeter of shapes: " + perimeter);
    }
}

