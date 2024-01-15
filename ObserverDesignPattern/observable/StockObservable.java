package ObserverDesignPattern.observable;

import ObserverDesignPattern.Observer.NotificationObserver;

public interface StockObservable {
    
    void add(NotificationObserver observable);
    void remove(NotificationObserver observer);
    void notifySubcribers();
    void setCount(int setCount);
    Integer getStock();
}
