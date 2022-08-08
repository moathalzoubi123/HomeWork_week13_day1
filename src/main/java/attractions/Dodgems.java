package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    Visitor visitor;

    public Dodgems(String name, int rating, Visitor visitor) {

        super(name, rating);
        this.visitor = visitor;
    }

    public double defaultPrice(){

        return 4.50;
    }

    public double priceFor(Visitor visitor) {

        if (this.visitor.getAge() < 12) {

            return 2.25;
        }

        return 4.50;
    }

    public boolean visitorCanPlay(Visitor visitor) {
        if (this.visitor.getMoney() > 4.50) {
            return true;
        }
        if (this.visitor.getMoney() > 2.25 && this.visitor.getAge() < 12){
            return true;
        }

        return false;
    }


}
