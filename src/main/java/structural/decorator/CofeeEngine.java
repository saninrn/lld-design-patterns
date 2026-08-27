package structural.decorator;

public class CofeeEngine {

    public static void main(String[] args) {
        //chain of associated beans : want simple cofee +sugar + milk. cost =30
        SimpleCofee cofee = new SimpleCofee();
        SugarCofee sugarCofee = new SugarCofee(cofee);
        MilkCofee milkCofee = new MilkCofee(sugarCofee);
        System.out.println(milkCofee.cost()); //30
        System.out.println(sugarCofee.cost()); //20
    }
}
