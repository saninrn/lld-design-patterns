package behavioural.observer;

//Observer pattern is when we want to notify an event to multiple observers so that all can execute respective post event actions.
// pub-sub model being an example where publisher pushes the event and notifies to subcribers

public interface OrderObservers {
    void afterOrderCreation();
}
