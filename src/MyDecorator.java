public class MyDecorator implements Sandwich{
    protected Sandwich sandwich;
    public MyDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    public double getCout(){
        return sandwich.getCout();
    }
    public String getDescription(){
        return sandwich.getDescription();
    }
}
