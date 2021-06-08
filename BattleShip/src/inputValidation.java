import java.util.Locale;

public class inputValidation {
    public int getRow(String input) {
        int row = 0;
        input = input.toLowerCase();

        switch (input){
            case "a":
                row = 0;
                break;
            case "b":
                row = 1;
                break;
            case "c":
                row = 2;
                break;
            case "d":
                row = 3;
                break;
            case "e":
                row = 4;
                break;
            case "f":
                row = 5;
                break;
            case "g":
                row = 6;
                break;
            case "h":
                row = 7;
                break;
            case "j":
                row = 8;
                break;
            case "k":
                row = 9;
                break;
            default:
                System.out.println("Invalid input!");
        }
        return row;
    }
    public int getColumn(String input) {
        int column = 0;
        input = input.toLowerCase();

        switch (input){
            case "1":
                column = 0;
                break;
            case "2":
                column = 1;
                break;
            case "3":
                column = 2;
                break;
            case "4":
                column = 3;
                break;
            case "5":
                column = 4;
                break;
            case "6":
                column = 5;
                break;
            case "7":
                column = 6;
                break;
            case "8":
                column = 7;
                break;
            case "9":
                column = 8;
                break;
            case "10":
                column = 9;
                break;
            default:
                System.out.println("Invalid input!");
        }
        return column;
    }
}
