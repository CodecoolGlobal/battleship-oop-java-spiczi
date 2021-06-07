import java.util.Scanner;

public class Game {
    static String createPlayer(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userName = scanner.nextLine();
        return userName;
    }


}
