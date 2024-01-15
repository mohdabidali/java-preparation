package ChainOfResponsiblity;

public class ErrorConcreteReciever extends LoggerReciever {
    ErrorConcreteReciever(LoggerReciever nextLoggerReciever) {
  super(nextLoggerReciever);
    }    

public void log(int LogLevel, String message){
    if(LogLevel == ERROR){
        System.out.println("ERROR"+ message);
    }
    else{
        super.log(LogLevel, message);
    }
}
}
