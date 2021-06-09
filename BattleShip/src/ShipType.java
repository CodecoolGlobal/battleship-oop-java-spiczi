public enum ShipType {
    CARRIER (4),
    CRUISER(4),
    BATTLESHIP(5),
    SUBMARINE(2),
    DESTROYER(3);

    public final Integer label;
    ShipType(Integer label) {
        this.label = label;
    }
}
