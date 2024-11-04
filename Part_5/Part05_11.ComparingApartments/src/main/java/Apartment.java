
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment other) {
        if (this.squares > other.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(squares * princePerSquare - ( compared.squares * compared.princePerSquare)) ;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (((Math.abs(squares * princePerSquare) > (Math.abs(compared.squares * compared.princePerSquare))))) {
            return true;
        } else {
            return false;
        }
    }

}
