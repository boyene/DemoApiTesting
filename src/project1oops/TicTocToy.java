package project1oops;


import java.util.Scanner;

public class TicTocToy {
    static char arr[][] = { { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' } };

    static char currentplayer = 'x';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (currentplayer != 0) {
            printboard();

            System.out.println("Enter rows");
            int row = sc.nextInt();
            System.out.println("Enter coloums");
            int col = sc.nextInt();

            if (row > 2 || row < 0 || col > 2 || col < 0) {
                System.out.println("invalid move");
                continue;
            }
            arr[row][col] = currentplayer;



            if (check()) {
                printboard();
                System.out.println("you winnnnnnnnn!!!!");
                break;
            }
            if (boardisfull()) {
                System.out.println("Draw the game");
                printboard();
                break;
            }

            if (currentplayer == 'x') {
                currentplayer = 'O';
            } else if (currentplayer == 'O') {
                currentplayer = 'x';
            }
        }
    }

    static void printboard() {
        System.out.println("-----------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|   ");
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + "|   ");

            }

            System.out.println("\n---------------");
        }
    }

    static boolean check() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((arr[i][0] == currentplayer && arr[i][1] == currentplayer && arr[i][2] == currentplayer)
                        || (arr[0][j] == currentplayer && arr[1][j] == currentplayer && arr[2][j] == currentplayer)
                        || (arr[0][0] == currentplayer && arr[1][1] == currentplayer && arr[2][2] == currentplayer)) {
                    return true;

                }
            }
        }
        return false;
    }

    static boolean boardisfull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;

    }
}