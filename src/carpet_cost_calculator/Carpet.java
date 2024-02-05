package carpet_cost_calculator;

public class Carpet {
    double cost;

    public Carpet(double cost){
        if(cost <0){
            this.cost =0;}
        else {this.cost = cost;}
    }

    public double getCost(){                 // returns total cost
        return this.cost;
    }
}
