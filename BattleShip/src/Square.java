public class Square {
    private int x;
    private int y;
    private SquareStatus squareStatus;

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }

    public Square(int x, int y, SquareStatus squareStatus) {
        this.x = x;
        this.y = y;
        squareStatus = squareStatus;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public  SquareStatus getSquareStatus() {
        return squareStatus;
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
            case  OCEAN:
                result = '~';
            case EMPTY:
                result = ' ';

        }
        return result;
    }
}
