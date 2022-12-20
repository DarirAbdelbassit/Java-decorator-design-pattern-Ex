public class Fromage extends MyDecorator{
    public Fromage(Sandwich sandwich){
        super(sandwich);
    }
    public double getCout(){
        return super.getCout() +2.0;
    }
    public String getDescription(){
        return super.getDescription() + ", fromage";
    }
}
