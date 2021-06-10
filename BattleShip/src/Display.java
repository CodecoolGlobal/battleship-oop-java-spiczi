public class Display {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public Display() {

    }

    public void printMenu() {
        System.out.println("Battleship is starting ............");
        System.out.println("\n" + "\n" +
                        "\n" +
                        "\n" +
                        "                                     # #  ( )\n" +
                        "                                  ___#_#___|__\n" +
                        "                              _  |____________|  _\n" +
                        "                       _=====| | |            | | |==== _\n" +
                        "                 =====| |.---------------------------. | |====\n" +
                        "   <--------------------'   .  .  .  .  .  .  .  .   '--------------/\n" +
                        "     \\                                                             /\n" +
                        "      \\_______________________________________________WWS_________/\n" +
                        "  wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                        "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                        "   wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww "
                );

    }
    public void printMessages(String message) {
        System.out.println(message);
    }

    public void printMainMenuOptions() {
        System.out.println("press: \n" +
                "\t 0 - Play \n" +
                "\t 1 - Print game rules \n" +
                "\t 2 - Exit game\n");
    }

    public void printExitMessage() {
        System.out.println("Have a nice day!");
    }

    public void gameRules() {
        System.out.println(" :)");
    }

    public void printBoard(Board board) {
        System.out.println("   ");
        for(int i = 0; i <board.getSizeX(); i++) {
            if(i < 10) {
                System.out.println(i + "  ");
            } else {
                System.out.println(i + " ");
            }

        }
        System.out.println();
        for(int row = 0; row < board.getSizeX(); row++) {
            if(row < 10) {
                System.out.println(row + "  ");
            } else {
                System.out.println(row + " ");
            }
            for (int col = 0; col < board.getSizeY(); col++) {
                switch (board.getSquare(row, col).getCharacter()) {
                    case 'O':
                        System.out.println(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'H':
                        System.out.println(ANSI_RED_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'S':
                        System.out.println(ANSI_YELLOW_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                    case 'M':
                        System.out.println(ANSI_BLACK_BACKGROUND + " " + ANSI_RESET + " ");
                        break;
                }
            }
            System.out.println();
        }


    }
}
