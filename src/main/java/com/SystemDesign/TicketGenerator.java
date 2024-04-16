package com.SystemDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TicketGenerator {
    public static void main(String[] args) {
        // Generate a set of 6 tickets
        for (int i = 0; i < 6; i++) {
            int[][] ticket = generateBingoTicket();
            finalCheck(ticket);
            printBingoTicket(ticket);
            System.out.println();
        }
    }

    private static int[][] generateBingoTicket() {
        int[][] ticket = new int[3][9];
        for (int[] a : ticket) {
            Arrays.fill(a, 0);
        }

        // Keep track of columns that have been filled with non-zero elements
        ArrayList<Integer> filledColumns = new ArrayList<>();

        // Fill each row with 5 non-zero elements
        for (int row = 0; row < 3; row++) {
            fillRow(ticket, row, filledColumns);
        }

        // Shuffle each column individually
        for (int col = 0; col < 9; col++) {
            shuffleColumn(ticket, col);
        }


        return ticket;
    }

    private static void fillRow(int[][] ticket, int row, ArrayList<Integer> filledColumns) {
        // Ensure at least one non-zero element in each available column
        for (int col = 0; col < 9; col++) {
            if (!filledColumns.contains(col)) {
                int num = (col * 10) + 1 + (int) (Math.random() * 10);
                ticket[row][col] = num;
                filledColumns.add(col);
            }
        }

        // If the row is not filled with 5 non-zero elements, fill the remaining randomly
        while (filledColumns.size() < 5) {
            ArrayList<Integer> availableColumns = new ArrayList<>();
            for (int col = 0; col < 9; col++) {
                if (!filledColumns.contains(col)) {
                    availableColumns.add(col);
                }
            }

            Collections.shuffle(availableColumns);

            int col = availableColumns.get(0);
            int num = (col * 10) + 1 + (int) (Math.random() * 10);
            ticket[row][col] = num;
            filledColumns.add(col);
        }
    }

    private static void finalCheck(int[][]ticket){
        int count=0;

        for (int i = 0; i < 3; i++) {
            count=0;
            for (int j = 0; j < 9; j++) {
                if(ticket[i][j]==0){
                    count++;
                }
            }
            if(count>=5){
                while (count>=5){
                    for (int k = 0; k < 6; k++) {
                        if(ticket[i][k]==0){
                            int num = (k * 10) + 1 + (int) (Math.random() * 10);
                            ticket[i][k]=num;
                            break;
                        }
                    }
                    count--;
                }
            }
        }

        ////00,10,20
        ////01,11,21
        ////02,12,22
        ////08,18,28

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                if(j<2 && ticket[j][i]==ticket[j+1][i] && ticket[j][i]!=0){
                    ticket[j][i]=ticket[j][i]+1;
                }
            }
        }
    }


    private static void shuffleColumn(int[][] ticket, int col) {
        ArrayList<Integer> columnNumbers = new ArrayList<>();
        for (int row = 0; row < 3; row++) {
            columnNumbers.add(ticket[row][col]);
        }
        Collections.shuffle(columnNumbers);
        for (int row = 0; row < 3; row++) {
            ticket[row][col] = columnNumbers.get(row);
        }
    }

    private static void printBingoTicket(int[][] ticket) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.printf("%2d ", ticket[row][col]);
            }
            System.out.println();
        }
    }
}


