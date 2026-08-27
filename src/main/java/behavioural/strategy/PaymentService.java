package behavioural.strategy;

import util.GlobalConstants;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private static Map<String, PaymentGateway> processorRegistry = new HashMap<>();
    private static final Stripe stripe = new Stripe();
    private static final Elavon elavon = new Elavon();
    private static final Razorpay razorpay = new Razorpay();

    public static void main(String[] args) {
        processorRegistry.put(GlobalConstants.ELAVON, elavon);
        processorRegistry.put(GlobalConstants.STRIPE, stripe);
        processorRegistry.put(GlobalConstants.RAZORPAY, razorpay);
    }

    public void pay(String processor) {
        processorRegistry.get(processor).pay(); // choosing a strategy from the registry and then executing pay action
    }
}
