import java.util.ArrayList;

public class Ship {
    private int size;
    private int marker;
    private String shipName;
    Ship(int size, int marker, String shipName) {
        this.size = size;
        this.marker = marker;
        this.shipName = shipName;
    }

    public int getSize() {
        return size;
    }

    public int getMarker() {
        return marker;
    }

    public String getShipName() {
        return shipName;
    }

}


