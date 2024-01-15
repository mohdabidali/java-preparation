package ChainOfResponsiblity;

public class DebugConcreteReciever extends LoggerReciever {
    DebugConcreteReciever(LoggerReciever nextLoggerReciever){
        super(nextLoggerReciever);
    }
    public void log(int LogLevel, String message){
        if(LogLevel == DEBUG){
            System.out.println("DEBUG"+ message);
        }
        else{
            super.log(LogLevel, message);
        }
    }
    
}
