package structural.decorator;

public class MilkCofee extends CofeeDecorator {
    public MilkCofee(Cofee cofee) {
        super(cofee);
    }

    @Override
    public double cost() {
        return this.getCofee().cost() + 10;
    }
}
