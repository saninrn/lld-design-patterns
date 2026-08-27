package behavioural.strategy;

//communication between beans happens in such a way that one strategy is chosen among multiple ways available and then action within that strategy executed

public interface PaymentGateway {
    void pay();
}
