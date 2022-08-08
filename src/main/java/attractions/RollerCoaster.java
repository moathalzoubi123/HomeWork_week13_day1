package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity,ITicketed {

    Visitor visitor;

    public RollerCoaster(String name, int rating, Visitor visitor) {

        super(name, rating);
        this.visitor = visitor;
    }

    public boolean isAllowedTo(Visitor visitor){
      if (this.visitor.getHeight() > 145 && this.visitor.getAge() > 12){

          return true;
      }

      return false;

    }

    public  double defaultPrice(){

        return 8.40;
    }

    public double priceFor(Visitor visitor) {

        if (this.visitor.getHeight() > 200 ) {

            return 16.80;
        }

        return 8.40;


    }
}
