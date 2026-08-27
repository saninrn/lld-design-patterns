package structural.decorator;

//decorator: IS a , HAS a Cofee
public abstract class CofeeDecorator implements Cofee{
    private Cofee cofee;

    public CofeeDecorator(Cofee cofee) {
        this.cofee = cofee;
    }

    public Cofee getCofee() {
        return cofee;
    }

    @Override
    public double cost() {
        return 0;
    }
}
