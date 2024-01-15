package ChainOfResponsiblity;

public class Main {
    public static void main(String[] args) {
        LoggerReciever loggerobject = new InfoConcreteReciever(new DebugConcreteReciever(new ErrorConcreteReciever(null)));
         loggerobject.log(LoggerReciever.DEBUG,"debug this code");
        loggerobject.log(LoggerReciever.DEBUG,"error occured");
        loggerobject.log(LoggerReciever.INFO,"just for info");
    }
}
