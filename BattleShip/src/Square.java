public class Square {
    private int x;
    private int y;
    private SquareStatus SquareStatus;

    public void setSquareStatus(SquareStatus squareStatus) {
        this.SquareStatus = squareStatus;
    }

    public Square(int x, int y, SquareStatus squareStatus) {
        this.x = x;
        this.y = y;
        SquareStatus = squareStatus;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public  SquareStatus getSquareStatus() {
        return SquareStatus;
    }


    public char getCharacter(){
        char result = ' ';
        switch(squareStatus){
            case HIT:
                result = 'B';
            case MISSED:
                result ='M';
            case SHIP:
                result = 'S';
            class OCEAN:
                result = '~';

        }
        return result;
    }
}
