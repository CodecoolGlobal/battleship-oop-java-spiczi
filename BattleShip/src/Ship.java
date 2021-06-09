import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Square> NewShip;
    private ShipType shipType;

    public Ship(List<Square> NewShip, ShipType shipType){
        NewShip = NewShip;
        this.shipType = shipType;
    }
    public  List<Square> getNewShip(){
        return NewShip;
    }
    public ShipType getShipType(){
        return shipType;
    }
    public void add(Square square){
        NewShip.add(square);

    //vallidaci a hajok elhelyezesere! A count
    public boolean PlacementCheck(Ship ship1, List<Ship> Ships, Board board) {
        int count = 0;
        for (int i = 0; i < ship1.getNewShip().size(); i++) {//vegig megyünk a mereten az 1 hajonak
            if (ship1.getNewShip().get(i).getY() > board.getSizeY() ||//hajo i edik elememenk y kordinataja nagyobb
                    ship1.getNewShip().get(i).getX() > board.getSizeX()) {//mint a tabla Y kordinata maxa vagy hajo i
                count++;//edik elemenek x kordinataja nagyobb mint tabla max xe akkr növeleje a countott 1!
            }
            for (int j = 0; j < Ships.size(); j++) { //vegig megyüpnk a hajo mereten ismet 2 x mert x es y fekvesü hajonk
                for (int k = 0; k < Ships.size(); k++) {//is lehet es hajo i edik elemenek x kordinataja es a y koardinataja
                    if (ship1.getNewShip().get(i).getX() == Ships.get(k).getNewShip().get(k).getX() &&
                            ship1.getNewShip().get(i).getY() == Ships.get(k).getNewShip().get(k).getY()) {
                        count++;// egyenlö a k adik ellem x es y kordinatajaval akkor ismet növelje a countot 1-el
                    }
                }
            }
        }if (count==0){
            return true;
        }
        return false;
    }

}

