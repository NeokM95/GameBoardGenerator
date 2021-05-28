package nl.koenm;

import java.util.Scanner;

public class GameBoardGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What size(NxN) do you want your board? typ N: ");

        int boardLength = in.nextInt();
        double boardSizeDouble = Math.pow(boardLength, 2);
        int boardSize = (int) boardSizeDouble;

        int[] board = new int[boardSize];

        for (int i = 0; i < board.length; i++) {
            if ((i + 1) % Math.sqrt(board.length) != 0) {
                System.out.printf("%02d | ", i);
            } else {
                System.out.printf("%02d%n", i);
                if (i < board.length - Math.sqrt(board.length)) {
                    System.out.print("---+");
                    for (int j = 0; j < Math.sqrt(board.length) - 2; j++) {
                        System.out.print("----+");
                    }
                    System.out.println("---");
                }
            }
        }

    }
}