public class ViandeHachee extends MyDecorator{
    public ViandeHachee(Sandwich s){
        super(s);
    }
    public double getCout(){
        return super.getCout()+15;
    }
    public String getDescription(){
        return super.getDescription()+", viande hachée";
    }
}
