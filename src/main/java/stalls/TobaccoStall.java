package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity{

    Visitor visitor;
    ParkingSpot parkingSpot;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot,int rating, Visitor visitor) {

        super(name, ownerName, parkingSpot,rating);
        this.visitor = visitor;
    }

    public boolean isAllowedTo(Visitor visitor){
        if ( this.visitor.getAge() > 18) {

            return true;
        }
        return false;
    }

}
