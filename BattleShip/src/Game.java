import java.util.Scanner;

public class Game {
    static Board board = new Board();

    static String createPlayer(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userName = scanner.nextLine();
        return userName;

    }
    static void shipPlacement(Player player){
        board.fillBoard();
        for(int i = 0; i < 2; i++) {
            // uj scanner es inputValidation objektum letrehozas az input bekereshez es atalakitashoz
            Scanner scanner= new Scanner(System.in);
            inputValidation validation = new inputValidation();
            System.out.println();
            System.out.println("Enter row!(A-K)");
            //bekerjuk az inputot mint string, es atalakitjuk integerre amit mar fel tudunk direkt hasznalni az arrayben
            String userInputRow = scanner.nextLine();
            int row = validation.getRow(userInputRow);

            System.out.println();
            System.out.println("Enter column!(1-10)");
            //bekerjuk az inputot mint string, es atalakitjuk integerre amit mar fel tudunk direkt hasznalni az arrayben
            String userInputColumn = scanner.nextLine();
            int column = validation.getColumn(userInputColumn);
            //itt a kapott input alapjan a boardunkban hullam helyett s beture valtozik az ertek, igy latjuk hogy hova raktunk
            player.playerBoard[row][column] = "S";
            board.ocean[row][column] = "S";
            board.printBoard();
        }
    }
    static void placementPhase(Player player){
        System.out.println(player.name+" place your ships!");
        board.printBoard();
        System.out.println();
        shipPlacement(player);
    }
    static void Play(){
        //letrehozunk egy tablat amin latni lehet majd a hajok poziciojat, illetve 2 player objektumot
        board.fillBoard();
        Player player1 = new Player(createPlayer(), board.ocean);
        Player player2 = new Player(createPlayer(), board.ocean);
        //
        placementPhase(player1);

        System.out.println();

        placementPhase(player2);

        System.out.println("TEST");
        System.out.println();
        System.out.println();
        board.printBoard(player1.playerBoard);
        System.out.println();
        board.printBoard(player2.playerBoard);


    }


}
