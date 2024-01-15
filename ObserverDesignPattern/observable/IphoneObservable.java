package ObserverDesignPattern.observable;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPattern.Observer.NotificationObserver;

public class IphoneObservable implements StockObservable{
  public List<NotificationObserver> observerList = new ArrayList<>();
    Integer stockCount =0;
    public void add(NotificationObserver observable){
        observerList.add(observable);
    }
    public void remove(NotificationObserver observer){
        observerList.remove(observer);
    }
    public void notifySubcribers(){
        for(NotificationObserver obj:observerList){
            obj.update();
        }
    }
    public void setCount(int AddStockCount){
        if(stockCount == 0){
            notifySubcribers();
        }
        stockCount += AddStockCount;
    }
    public Integer getStock(){
        return stockCount;
    }
}
