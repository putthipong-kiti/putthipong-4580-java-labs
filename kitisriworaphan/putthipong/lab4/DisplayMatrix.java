/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 13, 2023 
**/

package kitisriworaphan.putthipong.lab4;

import java.util.Scanner;

/**
 * This program accepts a matrix and then displays it in different ways.
 * 
 * @author Putthipong Kitisriworaphan
 * @version 1.0, 13/01/2023
 * 
 */
public class DisplayMatrix {
    static int[][] matrix;
    static int rowDim;
    static int colDim;
    static Scanner scanner = new Scanner(System.in);

    /**
     * The main method will run the DisplayMatrix program by accepts a matrix 
     * and displays in different ways.
     * 
     * @param args Program arguments
     */
    public static void main(String[] args) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixByColumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByDiagonalTopLeftBottomRight();
        showMatrixByDiagonalTopRightBottomLeft();
        showMatrixByRowZigzag();
        scanner.close();
    }

    /**
     * This method will reads the number of rows and columns 
     * and then repeatedly asks the user to enter each element in the matrix.
     */
    public static void inputMatrix() {
        System.out.print("Enter the size of the matrix (number of rows then number of columns) : ");
        rowDim = scanner.nextInt();
        colDim = scanner.nextInt();
        matrix = new int[rowDim][colDim];
        for (int r = 0; r < rowDim; r++) {
            for (int c = 0; c < colDim; c++) {
                System.out.print("Enter elements at row " + (r + 1) + " column " + (c + 1) + " : ");
                matrix[r][c] = scanner.nextInt();
            }
        }
    }

    /**
     * This method displays the original matrix that has been entered.
     */
    public static void showMatrix() {
        System.out.println("Show the original matrix :");
        for (int r = 0; r < rowDim; r++) {
            for (int c = 0; c < colDim; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This method displays the matrix by row.
     */
    public static void showMatrixByRow() {
        System.out.print("Show the matrix by row : ");
        for (int r = 0; r < rowDim; r++) {
            for (int c = 0; c < colDim; c++) {
                System.out.print(matrix[r][c] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This method displays the matrix by column.
     */
    public static void showMatrixByColumn() {
        System.out.print("Show the matrix by column : ");
        for (int c = 0; c < colDim; c++) {
            for (int r = 0; r < rowDim; r++) {
                System.out.print(matrix[r][c] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This method displays the matrix by row in reverse order.
     */
    public static void showMatrixByRowBackward() {
        System.out.print("Show the matrix by row backward : ");
        for (int r = (rowDim - 1); r > -1; r--) {
            for (int c = (colDim - 1); c > -1; c--) {
                System.out.print(matrix[r][c] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This method displays the matrix by column in reverse order.
     */
    public static void showMatrixByColumnBackward() {
        System.out.print("Show the matrix by column backward : ");
        for (int c = (colDim - 1); c > -1; c--) {
            for (int r = (rowDim - 1); r > -1; r--) {
                System.out.print(matrix[r][c] + " ");
            }
        }
        System.out.println();
    }

    /**
     * This method displays the diagonal elements of the matrix from the top left to the bottom right.
     */
    public static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("Show the diagonal elements of the matrix from top-left to bottom-right : ");
        for (int r = 0; r < rowDim; r++) {
            for (int c = 0; c < colDim; c++) {
                if (r == c) {
                    System.out.print(matrix[r][c] + " ");
                } else {
                    continue;
                }
            }
        }
        System.out.println();
    }

    /**
     * This method displays the diagonal elements of the matrix from the top right to the bottom left.
     */
    public static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("Show the diagonal elements of the matrix from top-right to bottom-left : ");
        if (rowDim < colDim) {
            for (int r = 0; r < rowDim; r++) {
                for (int c = (colDim - 1); c > -1; c--) {
                    if ((r + c) == rowDim) {
                        System.out.print(matrix[r][c] + " ");
                    } else {
                        continue;
                    }
                }
            }
        } else if (rowDim > colDim) {
            for (int r = 0; r < rowDim; r++) {
                for (int c = (colDim - 1); c > -1; c--) {
                    if ((r + c) == (colDim - 1)) {
                        System.out.print(matrix[r][c] + " ");
                    } else {
                        continue;
                    }
                }
            }
        } else {
            for (int r = 0; r < rowDim; r++) {
                for (int c = 0; c < colDim; c++) {
                    if ((r + c) == (rowDim - 1)) {
                        System.out.print(matrix[r][c] + " ");
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println();
    }

    /**
     * This method displays the matrix by row in zigzag order.
     */
    public static void showMatrixByRowZigzag() {
        System.out.print("Show the matrix by row zigzag : ");
        for (int r = 0; r < rowDim; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < colDim; c++) {
                    System.out.print(matrix[r][c] + " ");
                }
            } else {
                for (int c = (colDim - 1); c > -1; c--) {
                    System.out.print(matrix[r][c] + " ");
                }
            }
        }
        System.out.println();
    }
}
