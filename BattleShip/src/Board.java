public class Board {
    private  int sizeX;
    private  int sizeY;
    Square Matrix[][];

    public Board(int sizeX, int sizeY, Square Matrix[][]){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Matrix = Matrix;
    }
    public int getSizeX(){
        return sizeX;
    }
    public int getSizeY(){
        return sizeY;
    }
    public Square getMatrix(int x, int y){
        return Matrix[x][y];
    }
    public Square[][] fillBoard(int x, int y){
        Matrix = new Square[sizeX][sizeY];
        for (int row=0; row<sizeX; row++){
            for (int cullon=0; cullon<int  )
        }
    }
}
