import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Exercise7 {
        public static final char[] BOARD = new char[9];

        public static void printBoard() {
            System.out.println("-------------");
            System.out.println("| " + BOARD[0] + " | " + BOARD[1] + " | " + BOARD[2] + " |");
            System.out.println("-------------");
            System.out.println("| " + BOARD[3] + " | " + BOARD[4] + " | " + BOARD[5] + " |");
            System.out.println("-------------");
            System.out.println("| " + BOARD[6] + " | " + BOARD[7] + " | " + BOARD[8] + " |");
            System.out.println("-------------");

        }

        public static boolean isAvailable(char BOARD[], int spot) {
            if (BOARD[spot] == 'X' || BOARD[spot] == 'O') {
                return false;
            } else {
                return true;
            }
        }

        public static int getPositionFromUser() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter wanted position, from 1 to 9, to mark.");
            int spot = sc.nextInt() - 1;
            if (spot > 8 || spot < 0) {
                while (spot > 8 || spot < 0) {
                    System.out.println("ERROR: invalid spot. Please try again. ");
                    spot = sc.nextInt() - 1;
                    return spot;
                }
            }
            if (BOARD[spot] == 'X' || BOARD[spot] == 'O') {
                while (BOARD[spot] == 'X' || BOARD[spot] == 'O') {
                    System.out.println("ERROR: spot already marked. Please try again. ");
                    spot = sc.nextInt() - 1;
                    return spot;
                }
            } return spot;
        }

        public static char checkWinner(char BOARD[]) {
            if (BOARD[0] == BOARD[1] && BOARD[0] == BOARD[2] || BOARD[0] == BOARD[3] && BOARD[0] == BOARD[6] || BOARD[0] == BOARD[4] && BOARD[0] == BOARD[8]){
                return BOARD[0];}
            else if (BOARD[4] == BOARD[2] && BOARD[4] == BOARD[6] || BOARD[4] == BOARD[3] && BOARD[4] == BOARD[5] || BOARD[4] == BOARD[1] && BOARD[4] == BOARD[7]){
                return BOARD[4];}
            else if (BOARD[8]==BOARD[2] &&BOARD[8]==BOARD[5]||BOARD[8]==BOARD[6]&& BOARD[8]==BOARD[7]){
                return BOARD[8];
            }else {
                return '-';
            }
        }


        public static boolean placeSymbolOnBoard (char BOARD[], char symbol, int spot) {
            isAvailable(BOARD, spot);
            BOARD[spot] = symbol;
            printBoard();
            char res = checkWinner(BOARD);
            if (res == 'X' || res == 'O') {
                return true;
            }
            return false;

        }


        public static void main(String[] args) {
            printBoard();
            char symbol = 'X';
            boolean winner = false;
            do {
                int spot = getPositionFromUser();
                winner = placeSymbolOnBoard(BOARD, symbol, spot);
                if (symbol == 'X') {
                    symbol = 'O';
                } else {
                    symbol = 'X';
                }
            }
            while (!winner);






        }
    }