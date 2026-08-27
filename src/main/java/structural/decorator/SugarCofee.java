package structural.decorator;

public class SugarCofee extends CofeeDecorator{
    public SugarCofee(Cofee cofee) {
        super(cofee);
    }
    @Override
    public double cost() {
        return this.getCofee().cost() + 10;
    }
}
