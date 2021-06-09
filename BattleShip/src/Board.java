public class Board {
    private int sizeX;
    private int sizeY;
    Square matrix[][];

    public Board(int sizeX, int sizeY, Square[][] matrix) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.matrix = matrix;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

}
