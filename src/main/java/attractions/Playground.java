package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;


public class Playground extends Attraction implements ISecurity {

    Visitor visitor;

    public Playground(String name, int rating, Visitor visitor) {

        super(name, rating);
        this.visitor = visitor;
    }

    public boolean isAllowedTo(Visitor visitor){
       if (this.visitor.getAge() < 15 ) {
           return true ;
       }
       return false;

    }

}
