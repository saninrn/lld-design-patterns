package structural.decorator;

public class SimpleCofee implements Cofee{
    @Override
    public double cost() {
        return 10; //base cost
    }
}
