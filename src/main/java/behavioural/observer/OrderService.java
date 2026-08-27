package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<OrderObservers> observerList = new ArrayList<>();
//ADD all observers to above list

    public void createOrder() {
//SAVE ORDER
        notifyObserversAfterOrder();
    }

    public void notifyObserversAfterOrder() {
        //notify each observer by calling their notification method.
        for (OrderObservers orderObservers : observerList) {
            orderObservers.afterOrderCreation();
        }
    }
}
