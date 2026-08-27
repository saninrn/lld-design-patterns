package structural.proxy;

import behavioural.strategy.PaymentGateway;

//CLIENT --> PROXY --> TARGET
public class PaymentGatewayClient {
    private PaymentGateway paymentGateway;

    public void pay() {
        paymentGateway = new PaymentGatewayProxy();
        paymentGateway.pay();
    }
}
