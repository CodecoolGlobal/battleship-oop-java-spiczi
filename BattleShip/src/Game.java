import java.util.ArrayList;
import java.util.List;


public class Game {
    private List<Ship> shipsPlayer1 = new ArrayList<>();
    private List<Ship> shipsPlayer2 = new ArrayList<>();
    List<Board> boards;

    public void gameLogic() {
        Input board1 = new Input();
        boards = board1.getBoards();
        Board boardPlayer1 = boards.get(0);
        Board boardPlayer2 = boards.get(1);
        //Change i to increase or decrease number of ships for Player 1
        for (int i = 0; i < 2; i++) {
            Ship one = board1.createShip(0);
            while (one.isPlacementOK(one, shipsPlayer1, boardPlayer1) == false) {
                one = board1.createShip(0);

            }
            shipsPlayer1.add(one);
        }
        //Change i to increase or decrease number of ships for Player 2
        for (int i = 0; i < 2; i++) {
            Ship one = board1.createShip(1);
            while (one.isPlacementOK(one, shipsPlayer2, boardPlayer1) == false) {
                one = board1.createShip(1);

            }
            shipsPlayer2.add(one);
        }

        Player player1 = new Player(shipsPlayer1, boardPlayer2);
        Player player2 = new Player(shipsPlayer2, boardPlayer1);
        boolean gameOn = true;
        Display display = new Display();
        System.out.println("<<<<<<<<<<<< Player 1 Board >>>>>>>>>>>>");
        display.printBoard(boardPlayer1);
        System.out.println("------------------------------");
        System.out.println("<<<<<<<<<<<< Player 2 Board >>>>>>>>>>>>");
        display.printBoard(boardPlayer2);
        int numberOfShipsPlayer1 = player1.numberOfSquaresOfShips(shipsPlayer1);
        int numberOfShipsPlayer2 = player2.numberOfSquaresOfShips(shipsPlayer2);
        while (gameOn) {
            int[] ShootCoordinates;
            ShootCoordinates = board1.shoot(0);
            if (player2.handleShot(ShootCoordinates[0], ShootCoordinates[1])) {
                display.printBoard(player2.getBoard());
                numberOfShipsPlayer2--;
                System.out.println("Player 2 has " + numberOfShipsPlayer2 + " ships left!");
            } else {
                display.printBoard(player2.getBoard());
                System.out.println("Player 2 has " + numberOfShipsPlayer2 + " ships left!");
            }

            if(numberOfShipsPlayer2 == 0) {
                display.printBoard(player2.getBoard());
                System.out.println("Player 1 wins!");
                break;
            }

            ShootCoordinates = board1.shoot(1);
            if (player1.handleShot(ShootCoordinates[0], ShootCoordinates[1])) {
                display.printBoard(player1.getBoard());
                numberOfShipsPlayer1--;
                System.out.println("Player 1 has " + numberOfShipsPlayer1 + " ships left!");
            } else {
                display.printBoard(player1.getBoard());
                System.out.println("Player 1 has " + numberOfShipsPlayer1 + " ships left!");
            }

            if(numberOfShipsPlayer1 == 0) {
                display.printBoard(player1.getBoard());
                System.out.println("Player 2 wins!");
                break;
            }
        }


    }
}
