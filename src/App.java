public class App {
    public static void main(String[] args) throws Exception {
        Sandwich normalS = new BasiqueSandwich();
        System.out.println("Description: " + normalS.getDescription());
        System.out.println("Cout: " + normalS.getCout());
        Sandwich obj  = new Poulet(new Fromage(new Sauces(normalS)));
        System.out.println("Description: " + obj.getDescription());
        System.out.println("Cout: " + obj.getCout());
    }
}