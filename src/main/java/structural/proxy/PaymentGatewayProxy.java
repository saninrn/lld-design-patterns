package structural.proxy;

import behavioural.strategy.PaymentGateway;

//CLIENT --> PROXY --> TARGET
public class PaymentGatewayProxy implements PaymentGateway {
    PaymentGatewayImplementation paymentGatewayImplementation; // Real target bean

    @Override
    public void pay() {
        //audit request (extra code wrapped before)
        paymentGatewayImplementation.pay();// invoke target bean logic
        //audit response (extra code wrapped after)
    }
}
