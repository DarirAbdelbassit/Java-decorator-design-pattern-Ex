public class Sauces extends MyDecorator{
    public Sauces(Sandwich sandwich){
        super(sandwich);
    }
    public double getCout(){
        return super.getCout();
    }
    public String getDescription(){
        return super.getDescription() + ", [Algerienne, Andalouse]";
    }
}
