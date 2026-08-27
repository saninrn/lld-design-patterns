package creational;

//pattern to restrict only single bean creation of a concrete class. (note: do not confuse with singleton spring beans which are single bean used across and not that the more than one bean cannot be created)
public class SingletonPattern {
    private int age;
    //private static variable of type object and intialised.
    private static final SingletonPattern singletonPattern = new SingletonPattern(12);

    //private constructor
    private SingletonPattern(int age) {
        this.age = age;
    }

    //public static method to expose above variable
    public static SingletonPattern getSingletonBean() {
        return singletonPattern;
    }
}
