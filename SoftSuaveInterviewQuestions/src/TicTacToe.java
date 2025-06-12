import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
        static char[][] board = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'}
        };

        static char currentPlayer = 'X';
        static boolean vsBot = false;
        static Scanner scanner = new Scanner(System.in);
        static Random random = new Random();

        public static void main(String[] args) {
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("Choose mode:");
            System.out.println("1. Player vs Player");
            System.out.println("2. Player vs Bot");

            int choice;
            while (true) {
                System.out.print("Enter choice (1 or 2): ");
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) break;
                System.out.println("Invalid choice. Try again.");
            }

            vsBot = (choice == 2);
            boolean gameFinished = false;

            while (!gameFinished) {
                showBoard();

                if (vsBot && currentPlayer == 'O') {
                    System.out.println("Bot's turn...");
                    botMove();
                } else {
                    System.out.print("Player " + currentPlayer + ", choose a position (1-9): ");
                    int position = scanner.nextInt();

                    if (!addPosition(position)) {
                        System.out.println("Invalid move. Try again.");
                        continue;
                    }
                }

                if (checkWin()) {
                    showBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true;
                } else if (checkDraw()) {
                    showBoard();
                    System.out.println("It's a draw!");
                    gameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            scanner.close();
        }

        static void botMove() {
            while (true) {
                int position = random.nextInt(9) + 1;
                if (addPosition(position)) break;
            }
        }

        static boolean addPosition(int position) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == (char)(position + '0')) {
                        board[i][j] = currentPlayer;
                        return true;
                    }
                }
            }
            return false;
        }

        static boolean checkWin() {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer &&
                        board[i][1] == currentPlayer &&
                        board[i][2] == currentPlayer) return true;

                if (board[0][i] == currentPlayer &&
                        board[1][i] == currentPlayer &&
                        board[2][i] == currentPlayer) return true;
            }

            if (board[0][0] == currentPlayer &&
                    board[1][1] == currentPlayer &&
                    board[2][2] == currentPlayer) return true;

            return board[0][2] == currentPlayer &&
                    board[1][1] == currentPlayer &&
                    board[2][0] == currentPlayer;
        }

        static boolean checkDraw() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != 'X' && board[i][j] != 'O') {
                        return false;
                    }
                }
            }
            return true;
        }

        static void showBoard() {
            System.out.println();
            for (int i = 0; i < 3; i++) {
                System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) System.out.println("---+---+---");
            }
            System.out.println();
        }
    }

