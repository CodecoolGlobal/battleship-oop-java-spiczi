import java.util.ArrayList;

public class Board {
    final String water="~";
     String[][] ocean = new String[10][10];
     String row[]={"A", "B" , "C", "D", "E", "F", "G", "H", "J", "K"};
     String col[]={ " ","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    void fillBoard(){       // tabla feltöltes
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                ocean[i][j]=water;
            }
        }
    }
    void printBoard(String[][] board, String player){ //tabla megjelenitese
        System.out.println(player+"'s turn");
        for (int i=0;i<col.length; i++){
            System.out.print(col[i]+" ");
        }
        for (int j=0; j<10; j++){
            System.out.println();
            System.out.print(row[j]+" ");
            for (int k=0; k<10; k++){
                System.out.print(board[j][k]+" ");
            }
        }
    }
    void printBoard(){ //tabla megjelenitese
        for (int i=0;i<col.length; i++){
            System.out.print(col[i]+" ");
        }
        for (int j=0; j<10; j++){
            System.out.println();
            System.out.print(row[j]+" ");
            for (int k=0; k<10; k++){
                System.out.print(ocean[j][k]+" ");
            }
        }
    }
    void printBoard(String[][] board){ //tabla megjelenitese
        for (int i=0;i<col.length; i++){
            System.out.print(col[i]+" ");
        }
        for (int j=0; j<10; j++){
            System.out.println();
            System.out.print(row[j]+" ");
            for (int k=0; k<10; k++){
                System.out.print(board[j][k]+" ");
            }
        }
    }
    void changeField(int x, int y, String a) {
        ocean[x][y]=a;
    }
}
