public class Poulet extends MyDecorator{
    public Poulet(Sandwich sandwich){
        super(sandwich);
    }
    public double getCout(){
        return super.getCout()+10;
    }
    public String getDescription(){
        return super.getDescription()+", Poulet";
    }
}
