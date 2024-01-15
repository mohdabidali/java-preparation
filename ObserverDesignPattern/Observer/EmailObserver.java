package ObserverDesignPattern.Observer;

import ObserverDesignPattern.observable.StockObservable;

public class EmailObserver implements NotificationObserver{
    String email;
    StockObservable observable;
    EmailObserver(String email,StockObservable stockObservable){
        this.email= email;
        this.observable = stockObservable;
    }
 
    public void update(){
        sendEmail(email, "Product back in Stock");
    }

    private void sendEmail(String email, String message){
        
    }

}
